package org.soluvas.sanad.web;

import java.util.List;

import javax.inject.Inject;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.soluvas.sanad.core.QuranManager;
import org.soluvas.sanad.core.QuranManager.QuranChapterSummary;
import org.wicketstuff.annotation.mount.MountPath;

@SuppressWarnings("serial")
@MountPath("quran")
public class QuranPage extends GuestLayoutPage {

	@Inject
	QuranManager quranMgr;
	
	public QuranPage(PageParameters parameters) {
		super(parameters);
		LoadableDetachableModel<List<QuranChapterSummary>> chapterSummariesModel = new LoadableDetachableModel<List<QuranChapterSummary>>() {
			@Override
			protected List<QuranChapterSummary> load() {
				return quranMgr.findAllChapterSummaries();
			}
		};
		add(new ListView<QuranChapterSummary>("chapters", chapterSummariesModel) {
			@Override
			protected void populateItem(ListItem<QuranChapterSummary> item) {
				String chapterUrl = urlFor(QuranChapterPage.class, new PageParameters().add("chapterNum", item.getModelObject().getChapterNum())).toString();
				item.add(new AttributeModifier("href", chapterUrl));
				item.add(new Label("chapterNum", new PropertyModel<>(item.getModel(), "chapterNum")));
				item.add(new Label("verseCount", new PropertyModel<>(item.getModel(), "verseCount")));
				item.add(new Label("name", new PropertyModel<>(item.getModel(), "name")));
			}
		});
	}

}
