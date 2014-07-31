package org.soluvas.sanad.cli.qurandatabase;

import java.io.File;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.sanad.core.SanadConfig;
import org.soluvas.sanad.core.jpa.Literal;
import org.soluvas.sanad.core.jpa.QuranChapter;
import org.soluvas.sanad.core.jpa.QuranVerse;
import org.soluvas.sanad.core.jpa.Spelling;
import org.soluvas.sanad.core.jpa.SpellingProperty;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Imports <a href="http://qurandatabase.org/">QuranDatabase.org</a> data.
 * Takes ~4 minutes on a 4 GB i5.
 * 
 * <p>To reset all translations:
 * 
 * <pre>
 * DELETE FROM sanad.spellingproperty WHERE literal_id IN (SELECT id FROM sanad.literal WHERE id LIKE 'quran%' AND inlanguage <> 'ara');
 * DELETE FROM sanad.literal WHERE id LIKE 'quran%' AND inlanguage <> 'ara';
 * </pre>
 * 
 * @author ceefour
 */
@Configuration
@PropertySource("classpath:/META-INF/sanad.properties")
@EnableTransactionManagement
@Import(SanadConfig.class)
public class ImportQuranTranslation {
	
	private static final Logger log = LoggerFactory
			.getLogger(ImportQuranTranslation.class);
	
	@PersistenceContext
	EntityManager em;

	private Unmarshaller unmarshaller;

	public static void main(String[] args) throws JAXBException {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ImportQuranTranslation.class)) {
			ImportQuranTranslation cmd = ctx.getBean(ImportQuranTranslation.class);
			cmd.importTranslation("eng_pickthall", new File("/home/ceefour/git/qurandatabase/English-Pickthall-60.xml"));
			cmd.importTranslation("eng_shakir", new File("/home/ceefour/git/qurandatabase/English-Shakir-58.xml"));
			cmd.importTranslation("eng_yusufali", new File("/home/ceefour/git/qurandatabase/English-Yusuf-Ali-59.xml"));
			cmd.importTranslation("ind", new File("/home/ceefour/git/qurandatabase/Indonesian-Bahasa-Indonesia-68.xml"));
		}
	}
	
	@PostConstruct
	public void init() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(HolyQuran.class);
		unmarshaller = context.createUnmarshaller();
	}
	
	@Transactional
	public void importTranslation(String translationId, File file) throws JAXBException {
		HolyQuran tr = (HolyQuran) unmarshaller.unmarshal(file);
		for (Chapter chapter : tr.chapters) {
			QuranChapter quranChapter = em.find(QuranChapter.class, "quran_" + chapter.chapterId);
			String chapterNameText = chapter.chapterName;
			// Fix buggy QuranDatabase.org Indonesian translation chapter names
			if ("AL� AALI-IMRAN".equals(chapterNameText)) {
				chapterNameText = "ALI-IMRAN";
			} else if ("�BRAH�M".equals(chapterNameText)) {
				chapterNameText = "IBRAHIM";
			}
			
			log.info("Translating {} chapter {} {} with {} verses", 
					translationId, quranChapter.getChapterNum(), chapterNameText, quranChapter.getVerses().size());
			
			Literal chapterName = new Literal();
			chapterName.setCreativeWork(quranChapter);
			chapterName.setId(quranChapter.getId() + "_" + translationId);
			chapterName.setTranslator(tr.writer);
			chapterName.assignAdoc(chapterNameText);
			chapterName.setInLanguage(tr.languageIsoCode);
			chapterName.addToSpellings(new SpellingProperty(chapterName.getId() + "_formal", Spelling.FORMAL));
			em.persist(chapterName);
			
			for (Verse verse : chapter.verses) {
				log.trace("Processing chapter {} verse {}", chapter.chapterId, verse.verseId);
				
				QuranVerse quranVerse = em.find(QuranVerse.class, quranChapter.getId() + "_verse_" + verse.verseId);
				
				// Translation
				Literal translation = new Literal();
				translation.setCreativeWork(quranVerse);
				translation.setId(quranVerse.getId() + "_" + translationId);
				translation.setTranslator(tr.writer);
				translation.assignAdoc(verse.text);
				translation.setInLanguage(tr.languageIsoCode);
				translation.addToSpellings(new SpellingProperty(translation.getId() + "_formal", Spelling.FORMAL));
				em.persist(translation);
			}
		}
	}

}
