package org.soluvas.sanad.web.claim;

import java.io.Serializable;
import java.util.Locale;
import java.util.UUID;

import javax.inject.Inject;

import org.apache.shiro.SecurityUtils;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.Radio;
import org.apache.wicket.markup.html.form.RadioGroup;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.joda.time.DateTime;
import org.soluvas.commons.AppManifest;
import org.soluvas.commons.Person;
import org.soluvas.data.EntityLookupException;
import org.soluvas.data.LookupKey;
import org.soluvas.data.StatusMask;
import org.soluvas.data.person.PersonRepository;
import org.soluvas.jpa.jpa.PersonInfo;
import org.soluvas.sanad.core.ClaimManager;
import org.soluvas.sanad.core.jpa.Claim;
import org.soluvas.sanad.core.jpa.LiteralClaim;
import org.soluvas.sanad.core.jpa.Spelling;
import org.soluvas.sanad.core.jpa.Testimony;
import org.soluvas.sanad.web.AuthenticatedLayoutPage;
import org.soluvas.web.site.Interaction;
import org.soluvas.web.site.widget.AutoDisableAjaxButton;
import org.wicketstuff.annotation.mount.MountPath;

import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import com.google.common.html.HtmlEscapers;

/**
 * Form for adding a {@link Testimony} that contains {@link LiteralClaim}
 * and related.
 * @author ceefour
 */
@SuppressWarnings("serial")
@MountPath("testimony/add")
public class TestimonyLiteralAddPage extends AuthenticatedLayoutPage {

	/**
	 * Input object that will be used to construct a {@link Testimony} with {@link Claim}s.
	 * @author ceefour
	 */
	public static class TestimonyInput implements Serializable {
		String adoc;
		Spelling spelling;
		String inLanguage;
		
		public String getAdoc() {
			return adoc;
		}
		
		public void setAdoc(String adoc) {
			this.adoc = adoc;
		}
		
		public Spelling getSpelling() {
			return spelling;
		}
		
		public void setSpelling(Spelling spelling) {
			this.spelling = spelling;
		}

		public String getInLanguage() {
			return inLanguage;
		}

		public void setInLanguage(String inLanguage) {
			this.inLanguage = inLanguage;
		}
		
	}
	
	@Inject
	ClaimManager claimMgr;
	@Inject
	AppManifest appManifest;
	@Inject
	PersonRepository personRepo;
	
	private final Model<TestimonyInput> testimonyModel = new Model<>(new TestimonyInput());
	
	public class AddForm extends Form<TestimonyInput> {

		public AddForm(String id) {
			super(id, testimonyModel);
			add(new TextArea<>("adoc", new PropertyModel<>(testimonyModel, "adoc"))
					.setRequired(true));
			final DropDownChoice<String> langDdc = new DropDownChoice<>("lang", new PropertyModel<>(testimonyModel, "inLanguage"), 
					ImmutableList.of("id-ID", "en-US", "ar-SA"),
					new ChoiceRenderer<String>() {
				@Override
				public Object getDisplayValue(String object) {
					return Locale.forLanguageTag(object).getDisplayName(getLocale());
				}
			});
			langDdc.setRequired(true);
			add(langDdc);
			final RadioGroup<Spelling> spellingRg = new RadioGroup<>("spelling", new PropertyModel<Spelling>(testimonyModel, "spelling"));
			spellingRg.add(new Radio<>("unknown", new Model<Spelling>()));
			spellingRg.add(new Radio<>("official", new Model<>(Spelling.OFFICIAL)));
			spellingRg.add(new Radio<>("formal", new Model<>(Spelling.FORMAL)));
			spellingRg.add(new Radio<>("casual", new Model<>(Spelling.CASUAL)));
			spellingRg.add(new Radio<>("wrong", new Model<>(Spelling.WRONG)));
			spellingRg.add(new Radio<>("misleading", new Model<>(Spelling.MISLEADING)));
			add(spellingRg);
			final AutoDisableAjaxButton submitBtn = new AutoDisableAjaxButton("submitBtn") {
				@Override
				protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
					super.onSubmit(target, form);
					TestimonyInput testimonyInput = testimonyModel.getObject();
					Testimony testimony = new Testimony();
					testimony.setId(UUID.randomUUID());
					try {
						Person personInfo = personRepo.lookupOne(StatusMask.RAW, LookupKey.ID, (String) SecurityUtils.getSubject().getPrincipal());
						testimony.setPerson(PersonInfo.fromPerson(personInfo, appManifest.getDomain()));
					} catch (EntityLookupException e) {
						Throwables.propagate(e);
					}
					testimony.setCreationTime(new DateTime(appManifest.getDefaultTimeZone()));
					
					// spelling
					LiteralClaim literalClaim = new LiteralClaim();
					literalClaim.setTestimony(testimony);
					literalClaim.setId(UUID.randomUUID());
					literalClaim.setInLanguage(testimonyInput.getInLanguage());
					literalClaim.setAdoc(testimonyInput.getAdoc());
					literalClaim.setHtml(HtmlEscapers.htmlEscaper().escape(testimonyInput.getAdoc()));
					literalClaim.setSpelling(testimonyInput.getSpelling());
					testimony.addToClaims(literalClaim);
					
					testimony = claimMgr.addTestimony(testimony);
					
					Interaction.ADDED.info("Testimony added");
					setResponsePage(TestimonyPage.class, TestimonyPage.byId(testimony.getId()));
				}
			};
			add(submitBtn);
			setDefaultButton(submitBtn);
		}
		
	}
	
	public static PageParameters byId(UUID id) {
		return new PageParameters().set("id", id);
	}
	
	public TestimonyLiteralAddPage(PageParameters parameters) {
		super(parameters);
		
		TestimonyInput testimonyInput = testimonyModel.getObject();
		testimonyInput.setInLanguage(getLocale().toLanguageTag());
		
		add(new AddForm("form"));
	}
	
	@Override
	protected IModel<String> createPageTitleModel() {
		return new AbstractReadOnlyModel<String>() {
			@Override
			public String getObject() {
				return "Add Testimony - Sanad";
			}
		};
	}

}
