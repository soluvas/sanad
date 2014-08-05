package org.soluvas.sanad.web.thing;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.soluvas.sanad.core.ThingManager;
import org.soluvas.sanad.core.jpa.Spelling;
import org.soluvas.sanad.core.jpa.SpellingProperty;
import org.soluvas.sanad.core.jpa.Transliteration;
import org.soluvas.sanad.web.GuestLayoutPage;
import org.wicketstuff.annotation.mount.MountPath;

import com.google.common.collect.Iterables;

import de.agilecoders.wicket.core.markup.html.bootstrap.behavior.CssClassNameAppender;

@SuppressWarnings("serial")
@MountPath("transliteration/${id}")
public class TransliterationPage extends GuestLayoutPage {

	@Inject
	ThingManager thingMgr;
	private LoadableDetachableModel<Transliteration> tlModel;
	
	public static PageParameters byId(String id) {
		return new PageParameters().set("id", id);
	}
	
	public TransliterationPage(PageParameters parameters) {
		super(parameters);
		final String id = parameters.get("id").toString();
		tlModel = new LoadableDetachableModel<Transliteration>() {
			@Override
			protected Transliteration load() {
				return thingMgr.findOneTransliteration(id);
			}
		};
		add(new Label("abbr", new AbstractReadOnlyModel<String>() {
			@Override
			public String getObject() {
				return StringUtils.abbreviate(tlModel.getObject().getAdoc(), 50);
			}
		}));
		add(new Label("htmlText", new PropertyModel<>(tlModel, "html")));
		final AbstractReadOnlyModel<Spelling> spellingModel = new AbstractReadOnlyModel<Spelling>() {
			@Override
			public Spelling getObject() {
				final SpellingProperty spelling = Iterables.getFirst(tlModel.getObject().getSpellings(), null);
				return spelling != null ? spelling.getSpelling() : null;
			}
		};
		final Label spellingLabel = new Label("spelling", spellingModel);
		add(spellingLabel);
		spellingLabel.add(new CssClassNameAppender(new AbstractReadOnlyModel<String>() {
			@Override
			public String getObject() {
				Spelling spelling = spellingModel.getObject();
				if (spelling != null) {
					final String labelClass;
					switch (spelling) {
					case OFFICIAL:
					case FORMAL:
						return "label-success";
					case CASUAL:
						return "label-info";
					case WRONG:
						return "label-warning";
					case MISLEADING:
						return "label-danger";
					default:
						throw new IllegalArgumentException("Unrecognized spelling: " + spelling);
					}
				} else {
					return null;
				}
			}
		}));
		add(new Label("transliterator", new PropertyModel<>(tlModel, "transliterator")));
	}
	
	@Override
	protected void onDetach() {
		super.onDetach();
		tlModel.detach();
	}
	
	@Override
	protected IModel<String> createPageTitleModel() {
		return new AbstractReadOnlyModel<String>() {
			@Override
			public String getObject() {
				String abbr = StringUtils.abbreviate(tlModel.getObject().getAdoc(), 100);
				return abbr + " - Transliteration - Sanad";
			}
		};
	}

}
