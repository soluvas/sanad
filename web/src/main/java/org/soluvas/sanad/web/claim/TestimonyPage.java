package org.soluvas.sanad.web.claim;

import java.util.List;
import java.util.UUID;

import javax.inject.Inject;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.Fragment;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.soluvas.sanad.core.ClaimManager;
import org.soluvas.sanad.core.jpa.AuthenticityClaim;
import org.soluvas.sanad.core.jpa.Claim;
import org.soluvas.sanad.core.jpa.LiteralClaim;
import org.soluvas.sanad.core.jpa.NarratorClaim;
import org.soluvas.sanad.core.jpa.SuccessionClaim;
import org.soluvas.sanad.core.jpa.Testimony;
import org.soluvas.sanad.core.jpa.ThingClaim;
import org.soluvas.sanad.core.jpa.TransliterationClaim;
import org.soluvas.sanad.web.GuestLayoutPage;
import org.soluvas.web.site.widget.DateTimeLabel2;
import org.wicketstuff.annotation.mount.MountPath;

import com.google.common.collect.ImmutableList;

import de.agilecoders.wicket.core.markup.html.bootstrap.behavior.CssClassNameAppender;

@SuppressWarnings("serial")
@MountPath("testimony/${id}")
public class TestimonyPage extends GuestLayoutPage {

	@Inject
	ClaimManager claimMgr;
	private LoadableDetachableModel<Testimony> testimonyModel;
	
	public static PageParameters byId(UUID id) {
		return new PageParameters().set("id", id);
	}
	
	public TestimonyPage(PageParameters parameters) {
		super(parameters);
		final UUID id = UUID.fromString(parameters.get("id").toString());
		testimonyModel = new LoadableDetachableModel<Testimony>() {
			@Override
			protected Testimony load() {
				return claimMgr.findOneTestimony(id);
			}
		};
		add(new Label("testimonyPerson", new PropertyModel<>(testimonyModel, "personId")));
		add(new Label("testimonyPerson2", new PropertyModel<>(testimonyModel, "personId")));
		add(new DateTimeLabel2("creationTime", new PropertyModel<>(testimonyModel, "creationTime")));
		
		AbstractReadOnlyModel<List<Claim>> claimsModel = new AbstractReadOnlyModel<List<Claim>>() {
			@Override
			public List<Claim> getObject() {
				return ImmutableList.copyOf(testimonyModel.getObject().getClaims());
			}
		};
		final ListView<Claim> claimDv = new ListView<Claim>("claims", claimsModel) {
			@Override
			protected void populateItem(ListItem<Claim> item) {
				Claim claim = item.getModelObject();
//				String claimUrl = urlFor(ClaimPage.class, ClaimPage.byId(claim.getId())).toString();
//				item.add(new AttributeModifier("href", claimUrl));
				if (claim instanceof LiteralClaim) {
					final Fragment fragment = new Fragment("fragment", "literal", this);
					final LiteralClaim literalClaim = (LiteralClaim) claim;
					final Label spellingLabel = new Label("spelling", literalClaim.getSpelling());
					if (literalClaim.getSpelling() != null) {
						final String labelClass;
						switch (literalClaim.getSpelling()) {
						case OFFICIAL:
						case FORMAL:
							labelClass = "label-success";
							break;
						case CASUAL:
							labelClass = "label-info";
							break;
						case WRONG:
							labelClass = "label-warning";
							break;
						case MISLEADING:
							labelClass = "label-danger";
							break;
						default:
							throw new IllegalArgumentException("Unrecognized spelling: " + literalClaim.getSpelling());
						}
						spellingLabel.add(new CssClassNameAppender(labelClass));
					}
					fragment.add(spellingLabel);
					fragment.add(new Label("literal", literalClaim.getHtml()).setEscapeModelStrings(false));
					item.add(fragment);
				} else if (claim instanceof TransliterationClaim) {
					final Fragment fragment = new Fragment("fragment", "transliteration", this);
					item.add(fragment);
				} else if (claim instanceof AuthenticityClaim) {
					final Fragment fragment = new Fragment("fragment", "authenticity", this);
					item.add(fragment);
				} else if (claim instanceof SuccessionClaim) {
					final Fragment fragment = new Fragment("fragment", "succession", this);
					item.add(fragment);
				} else if (claim instanceof ThingClaim) {
					final Fragment fragment = new Fragment("fragment", "thing", this);
					item.add(fragment);
				} else if (claim instanceof NarratorClaim) {
					final Fragment fragment = new Fragment("fragment", "narrator", this);
					item.add(fragment);
				} else {
					throw new IllegalArgumentException("Unrecognized claim: " + claim.getClass().getName());
				}
			}
		};
		add(claimDv);
	}
	
	@Override
	protected void onDetach() {
		super.onDetach();
		testimonyModel.detach();
	}
	
	@Override
	protected IModel<String> createPageTitleModel() {
		return new AbstractReadOnlyModel<String>() {
			@Override
			public String getObject() {
				return testimonyModel.getObject().getPersonId() + "'s Testimony - Sanad";
			}
		};
	}

}
