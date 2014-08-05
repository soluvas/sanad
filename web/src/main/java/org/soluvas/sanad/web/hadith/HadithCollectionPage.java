package org.soluvas.sanad.web.hadith;

import java.util.Iterator;

import javax.inject.Inject;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.markup.repeater.data.IDataProvider;
import org.apache.wicket.model.AbstractReadOnlyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.soluvas.data.domain.PageOffsetRequest;
import org.soluvas.data.domain.Sort.Direction;
import org.soluvas.sanad.core.HadithManager;
import org.soluvas.sanad.core.jpa.Hadith;
import org.soluvas.sanad.core.jpa.HadithCollection;
import org.soluvas.sanad.web.GuestLayoutPage;
import org.wicketstuff.annotation.mount.MountPath;

import de.agilecoders.wicket.core.markup.html.bootstrap.navigation.ajax.BootstrapAjaxPagingNavigator;

@SuppressWarnings("serial")
@MountPath("hadith/${slug}")
public class HadithCollectionPage extends GuestLayoutPage {

	@Inject
	HadithManager hadithMgr;
	private LoadableDetachableModel<HadithCollection> collModel;
	private LoadableDetachableModel<Long> hadithCountModel;
	
	public static PageParameters bySlug(String slug) {
		return new PageParameters().set("slug", slug);
	}
	
	public HadithCollectionPage(PageParameters parameters) {
		super(parameters);
		final String upSlug = parameters.get("slug").toString();
		collModel = new LoadableDetachableModel<HadithCollection>() {
			@Override
			protected HadithCollection load() {
				return hadithMgr.findOneCollection(upSlug);
			}
		};
		hadithCountModel = new LoadableDetachableModel<Long>() {
			@Override
			protected Long load() {
				return hadithMgr.getCollectionHadithCount(upSlug);
			}
		};
		add(new Label("collName", new PropertyModel<>(collModel, "name")));
		add(new Label("collAuthor", new PropertyModel<>(collModel, "author")));
		
		IDataProvider<Hadith> hadithsDp = new IDataProvider<Hadith>() {
			@Override
			public void detach() {
			}

			@Override
			public Iterator<? extends Hadith> iterator(long first, long count) {
				return hadithMgr.findAllHadiths(upSlug, new PageOffsetRequest(first, count, Direction.ASC, "hadithNum")).iterator();
			}

			@Override
			public long size() {
				return hadithCountModel.getObject();
			}

			@Override
			public IModel<Hadith> model(Hadith object) {
				return new LoadableDetachableModel<Hadith>(object) {
					@Override
					protected Hadith load() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
		
		final DataView<Hadith> hadithDv = new DataView<Hadith>("hadiths", hadithsDp, 20) {
			@Override
			protected void populateItem(Item<Hadith> item) {
				item.add(new Label("hadithNum", new PropertyModel<>(item.getModel(), "hadithNum")));
				item.add(new Label("text", item.getModelObject().getTexts().iterator().next().getHtml())
					.setEscapeModelStrings(false));
			}
		};
		add(hadithDv);
		add(new BootstrapAjaxPagingNavigator("pagingNavigator", hadithDv));
	}
	
	@Override
	protected void onDetach() {
		super.onDetach();
		collModel.detach();
		hadithCountModel.detach();
	}
	
	@Override
	protected IModel<String> createPageTitleModel() {
		return new AbstractReadOnlyModel<String>() {
			@Override
			public String getObject() {
				return collModel.getObject().getName() + " - Hadith - Sanad";
			}
		};
	}

}
