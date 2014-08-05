package org.soluvas.sanad.web;

import java.util.List;

import javax.inject.Inject;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.soluvas.sanad.core.QuranManager;
import org.soluvas.sanad.core.jpa.QuranChapter;
import org.soluvas.sanad.core.jpa.QuranVerse;
import org.wicketstuff.annotation.mount.MountPath;

@SuppressWarnings("serial")
@MountPath("quran/${chapterNum}")
public class QuranChapterPage extends GuestLayoutPage {

	@Inject
	QuranManager quranMgr;
	
	public static PageParameters byChapterNum(int chapterNum) {
		return new PageParameters().set("chapterNum", chapterNum);
	}
	
	public QuranChapterPage(PageParameters parameters) {
		super(parameters);
		LoadableDetachableModel<QuranChapter> chapterModel = new LoadableDetachableModel<QuranChapter>() {
			@Override
			protected QuranChapter load() {
				return quranMgr.findOneChapter(parameters.get("chapterNum").toInt());
			}
		};
		add(new Label("chapterName", new PropertyModel<>(chapterModel, "name")));
		add(new ListView<QuranVerse>("verses", new PropertyModel<List<QuranVerse>>(chapterModel, "verses")) {
			@Override
			protected void populateItem(ListItem<QuranVerse> item) {
				item.add(new Label("verseNum", new PropertyModel<>(item.getModel(), "verseNum")));
				item.add(new Label("text", new PropertyModel<>(item.getModel(), "text.html"))
					.setEscapeModelStrings(false));
				item.add(new Label("transliteration", new PropertyModel<>(item.getModel(), "transliteration.html"))
					.setEscapeModelStrings(false));
			}
		});
	}

}
