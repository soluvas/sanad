package org.soluvas.sanad.web.hadith;

import java.util.List;

import javax.inject.Inject;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.soluvas.sanad.core.HadithManager;
import org.soluvas.sanad.core.HadithManager.HadithCollectionSummary;
import org.soluvas.sanad.web.GuestLayoutPage;
import org.wicketstuff.annotation.mount.MountPath;

@SuppressWarnings("serial")
@MountPath("hadith")
public class HadithCollectionListPage extends GuestLayoutPage {

	@Inject
	HadithManager hadithMgr;
	private LoadableDetachableModel<List<HadithCollectionSummary>> collSummariesModel;
	
	public HadithCollectionListPage(PageParameters parameters) {
		super(parameters);
		collSummariesModel = new LoadableDetachableModel<List<HadithCollectionSummary>>() {
			@Override
			protected List<HadithCollectionSummary> load() {
				return hadithMgr.findAllCollectionSummaries();
			}
		};
		add(new ListView<HadithCollectionSummary>("colls", collSummariesModel) {
			@Override
			protected void populateItem(ListItem<HadithCollectionSummary> item) {
				String collUrl = urlFor(HadithCollectionPage.class, HadithCollectionPage.bySlug(item.getModelObject().getSlug())).toString();
				item.add(new AttributeModifier("href", collUrl));
				item.add(new Label("hadithCount", new PropertyModel<>(item.getModel(), "hadithCount")));
				item.add(new Label("name", new PropertyModel<>(item.getModel(), "name")));
				item.add(new Label("author", new PropertyModel<>(item.getModel(), "author")));
			}
		});
	}
	
	@Override
	protected void onDetach() {
		super.onDetach();
		collSummariesModel.detach();
	}
	
	@Override
	protected IModel<String> createPageTitleModel() {
		return new Model<>("Hadith Collections - Sanad");
	}

}
