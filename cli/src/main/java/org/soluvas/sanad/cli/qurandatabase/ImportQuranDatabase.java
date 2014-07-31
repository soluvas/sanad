package org.soluvas.sanad.cli.qurandatabase;

import java.io.File;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.jsoup.Jsoup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.sanad.core.AsciidocUtils;
import org.soluvas.sanad.core.SanadConfig;
import org.soluvas.sanad.core.jpa.Authenticity;
import org.soluvas.sanad.core.jpa.AuthenticityProperty;
import org.soluvas.sanad.core.jpa.Literal;
import org.soluvas.sanad.core.jpa.QuranChapter;
import org.soluvas.sanad.core.jpa.QuranVerse;
import org.soluvas.sanad.core.jpa.Spelling;
import org.soluvas.sanad.core.jpa.SpellingProperty;
import org.soluvas.sanad.core.jpa.Succession;
import org.soluvas.sanad.core.jpa.SuccessionProperty;
import org.soluvas.sanad.core.jpa.Transliteration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Imports <a href="http://qurandatabase.org/">QuranDatabase.org</a> data.
 * Takes ~4 minutes on a 4 GB i5.
 * @author ceefour
 */
@Configuration
@PropertySource("classpath:/META-INF/sanad.properties")
@EnableTransactionManagement
@Import(SanadConfig.class)
public class ImportQuranDatabase {
	
	private static final Logger log = LoggerFactory
			.getLogger(ImportQuranDatabase.class);
	
	@PersistenceContext
	EntityManager em;
	private HolyQuran quran;
	private HolyQuran translit;
	
	public static void main(String[] args) throws JAXBException {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ImportQuranDatabase.class)) {
			ImportQuranDatabase cmd = ctx.getBean(ImportQuranDatabase.class);
			cmd.load();
			cmd.persistQuran();
		}
	}
	
	public void load() throws JAXBException {
		String quranFile = "/home/ceefour/git/qurandatabase/Arabic-(Original-Book)-1.xml";
		JAXBContext context = JAXBContext.newInstance(HolyQuran.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		quran = (HolyQuran) unmarshaller.unmarshal(new File(quranFile));
		log.info("Quran has {} chapters: {}", quran.chapters.size(),
				quran.chapters.stream().map((it) -> it.chapterName).toArray());
		log.info("First verse: {}", quran.chapters.get(0).verses.get(0));
		
		String translitFile = "/home/ceefour/git/qurandatabase/English-Transliteration-63.xml";
		translit = (HolyQuran) unmarshaller.unmarshal(new File(translitFile));
	}
	
	@Transactional
	public void persistQuran() {
		for (Chapter chapter : quran.chapters) {
			QuranChapter quranChapter = new QuranChapter();
			quranChapter.setAuthor(quran.writer);
			quranChapter.setChapterNum(chapter.chapterId);
			quranChapter.setName(chapter.chapterName);
			quranChapter.setId("quran_" + chapter.chapterId);
			quranChapter.setSlug("quran-" + chapter.chapterId);
			quranChapter.setCanonicalSlug("quran" + chapter.chapterId);
			quranChapter.setInLanguage(quran.languageIsoCode);
			
//			quranChapter = em.merge(quranChapter);
			for (Verse verse : chapter.verses) {
				log.trace("Processing chapter {} verse {}", chapter.chapterId, verse.verseId);
				
				QuranVerse quranVerse = new QuranVerse();
				quranVerse.setChapter(quranChapter);
				quranVerse.setAuthor(quran.writer);
				quranVerse.setVerseNum(verse.verseId);
				quranVerse.setId("quran_" + chapter.chapterId + "_verse_" + verse.verseId);
				quranVerse.setName("Quran " + chapter.chapterId + ":" + verse.verseId);
				quranVerse.setSlug("quran-" + chapter.chapterId + "-verse-" + verse.verseId);
				quranVerse.setCanonicalSlug("quran" + chapter.chapterId + "verse" + verse.verseId);
				quranVerse.setInLanguage(quran.languageIsoCode);
				quranVerse.addToAuthenticities(new AuthenticityProperty(quranVerse.getId() + "_authentic", Authenticity.AUTHENTIC));
				quranVerse.addToSuccessions(new SuccessionProperty(quranVerse.getId() + "_wording", Succession.WORDING));
				// Arabic text with tashkeel
				Literal tashkeelLiteral = new Literal();
				tashkeelLiteral.setCreativeWork(quranVerse);
				tashkeelLiteral.setId(quranVerse.getId() + "_tashkeel");
				tashkeelLiteral.assignAdoc(verse.text);
				tashkeelLiteral.setInLanguage(quran.languageIsoCode);
				tashkeelLiteral.addToSpellings(new SpellingProperty(tashkeelLiteral.getId() + "_official", Spelling.OFFICIAL));
				quranVerse.addToTexts(tashkeelLiteral);
				quranVerse.setText(tashkeelLiteral);
				// Transliteration
				Transliteration tl = new Transliteration();
				tl.setCreativeWork(quranVerse);
				tl.setId(quranVerse.getId() + "_transliteration_eng");
				tl.setTransliterator(translit.writer);
				tl.setHtml(translit.chapters.get(chapter.chapterId - 1).verses.get(verse.verseId - 1).text);
				String tlAdoc = Jsoup.parse(tl.getHtml()).text();
				tl.setAdoc(tlAdoc);
				tl.setNormalized(AsciidocUtils.normalize(tlAdoc));
				tl.addToSpellings(new SpellingProperty(tl.getId() + "_official", Spelling.OFFICIAL));
				quranVerse.addToTransliterations(tl);
				quranVerse.setTransliteration(tl);
				
				quranChapter.addToVerses(quranVerse);
			}
			log.info("Persisting chapter {} {} with {} verses", 
					quranChapter.getChapterNum(), quranChapter.getName(), quranChapter.getVerses().size());
			quranChapter = em.merge(quranChapter);
		}
	}

}
