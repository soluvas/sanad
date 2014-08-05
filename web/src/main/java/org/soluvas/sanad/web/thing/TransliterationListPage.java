package org.soluvas.sanad.web.thing;

import java.util.Iterator;

import javax.annotation.Nullable;
import javax.inject.Inject;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.Component;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.EmptyPanel;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.markup.repeater.data.IDataProvider;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.soluvas.data.domain.PageOffsetRequest;
import org.soluvas.data.domain.Sort.Direction;
import org.soluvas.sanad.core.ThingManager;
import org.soluvas.sanad.core.jpa.SpellingProperty;
import org.soluvas.sanad.core.jpa.Transliteration;
import org.soluvas.sanad.web.GuestLayoutPage;
import org.soluvas.web.site.JpaModel;
import org.wicketstuff.annotation.mount.MountPath;

import com.google.common.collect.Iterables;

import de.agilecoders.wicket.core.markup.html.bootstrap.behavior.CssClassNameAppender;
import de.agilecoders.wicket.core.markup.html.bootstrap.navigation.ajax.BootstrapAjaxPagingNavigator;

@SuppressWarnings("serial")
@MountPath("transliteration")
public class TransliterationListPage extends GuestLayoutPage {

	@Inject
	ThingManager thingMgr;
	
	public TransliterationListPage(PageParameters parameters) {
		super(parameters);
		
		IDataProvider<Transliteration> tlsDp = new IDataProvider<Transliteration>() {
			@Override
			public void detach() {
			}

			@Override
			public Iterator<? extends Transliteration> iterator(long first, long count) {
				return thingMgr.findAllTransliterationsWithoutCreativeWork(new PageOffsetRequest(first, count, Direction.ASC, "normalized")).iterator();
			}

			@Override
			public long size() {
				return thingMgr.getTransliterationWithoutCreativeWorkCount();
			}

			@Override
			public IModel<Transliteration> model(Transliteration object) {
				return new JpaModel<>(Transliteration.class, object.getId(), object);
			}
		};
		
		final DataView<Transliteration> tlDv = new DataView<Transliteration>("tls", tlsDp, 20) {
			@Override
			protected void populateItem(Item<Transliteration> item) {
				Transliteration tl = item.getModelObject();
				String tlUrl = urlFor(TransliterationPage.class, TransliterationPage.byId(tl.getId())).toString();
				item.add(new AttributeModifier("href", tlUrl));
				@Nullable
				SpellingProperty spelling = Iterables.getFirst(tl.getSpellings(), null);
				String bgClass = null;
				if (spelling != null) {
					final Label spellingLabel = new Label("spelling", spelling.getSpelling());
					final String labelClass;
					switch (spelling.getSpelling()) {
					case OFFICIAL:
					case FORMAL:
						labelClass = "label-success";
						bgClass = "bg-success";
						break;
					case CASUAL:
						labelClass = "label-info";
						bgClass = "bg-info";
						break;
					case WRONG:
						labelClass = "label-warning";
						bgClass = "bg-warning";
						break;
					case MISLEADING:
						labelClass = "label-danger";
						bgClass = "bg-danger";
						break;
					default:
						throw new IllegalArgumentException("Unrecognized spelling: " + spelling.getSpelling());
					}
					spellingLabel.add(new CssClassNameAppender(labelClass));
					item.add(spellingLabel);
				} else {
					item.add(new EmptyPanel("spelling"));
				}
				final Component htmlLabel = new Label("html", tl.getHtml()).setEscapeModelStrings(false);
				item.add(htmlLabel);
				item.add(new Label("transliterator", tl.getTransliterator()));
			}
		};
		add(tlDv);
		add(new BootstrapAjaxPagingNavigator("pagingNavigator", tlDv));
	}
	
	@Override
	protected void onDetach() {
		super.onDetach();
	}
	
	@Override
	protected IModel<String> createPageTitleModel() {
		return new Model<>("Transliterations - Sanad");
	}

}
