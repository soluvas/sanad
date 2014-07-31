package org.soluvas.sanad.cli.qurandatabase;

import java.io.File;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.sanad.core.SanadConfig;
import org.soluvas.sanad.core.jpa.QuranChapter;
import org.soluvas.sanad.core.jpa.QuranVerse;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Imports <a href="http://qurandatabase.org/">QuranDatabase.org</a> data
 * @author ceefour
 */
@Configuration
@PropertySource("classpath:/META-INF/sanad.properties")
@EnableTransactionManagement
@Import(SanadConfig.class)
public class ImportQuranDatabase {
	
	private static final Logger log = LoggerFactory
			.getLogger(ImportQuranDatabase.HolyQuran.class);
	
	@XmlRootElement(name="HolyQuran")
	public static class HolyQuran {
		@XmlAttribute(name="TranslationID")
		int translationId;
		@XmlAttribute(name="Writer")
		String writer;
		@XmlAttribute(name="Language")
		String language;
		@XmlAttribute(name="LanguageIsoCode")
		String languageIsoCode;
		
		@XmlElement(name="Chapter")
		List<Chapter> chapters;
	}
	
	public static class Chapter {
		@XmlAttribute(name="ChapterID")
		int chapterId;
		@XmlAttribute(name="ChapterName")
		String chapterName;
		
		@XmlElement(name="Verse")
		List<Verse> verses;
	}
	
	public static class Verse {
		@XmlAttribute(name="VerseID")
		int verseId;
		
		@XmlValue
		String text;

		@Override
		public String toString() {
			return "Verse [verseId=" + verseId + ", text=" + text + "]";
		}
	}
	
	@PersistenceContext
	EntityManager em;
	private HolyQuran quran;
	
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
		Unmarshaller unmarshaller= context.createUnmarshaller();
		quran = (HolyQuran) unmarshaller.unmarshal(new File(quranFile));
		log.info("Quran has {} chapters: {}", quran.chapters.size(),
				quran.chapters.stream().map((it) -> it.chapterName).toArray());
		log.info("First verse: {}", quran.chapters.get(0).verses.get(0));
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
				QuranVerse quranVerse = new QuranVerse();
				quranVerse.setChapter(quranChapter);
				quranVerse.setAuthor(quran.writer);
				quranVerse.setVerseNum(verse.verseId);
				quranVerse.setId("quran_" + chapter.chapterId + "_verse_" + verse.verseId);
				quranVerse.setName("Quran " + chapter.chapterId + ":" + verse.verseId);
				quranVerse.setSlug("quran-" + chapter.chapterId + "-verse-" + verse.verseId);
				quranVerse.setCanonicalSlug("quran" + chapter.chapterId + "verse" + verse.verseId);
				quranVerse.setInLanguage(quran.languageIsoCode);
				quranVerse.setText(verse.text);
				quranChapter.addToVerses(quranVerse);
			}
			log.info("Persisting chapter {} {} with {} verses", 
					quranChapter.getChapterNum(), quranChapter.getName(), quranChapter.getVerses().size());
			quranChapter = em.merge(quranChapter);
		}
	}

}
