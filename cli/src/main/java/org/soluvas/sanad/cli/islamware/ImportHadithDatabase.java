package org.soluvas.sanad.cli.islamware;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import jline.internal.InputStreamReader;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.SlugUtils;
import org.soluvas.sanad.core.SanadConfig;
import org.soluvas.sanad.core.jpa.Authenticity;
import org.soluvas.sanad.core.jpa.AuthenticityProperty;
import org.soluvas.sanad.core.jpa.Hadith;
import org.soluvas.sanad.core.jpa.HadithCollection;
import org.soluvas.sanad.core.jpa.Literal;
import org.soluvas.sanad.core.jpa.Spelling;
import org.soluvas.sanad.core.jpa.SpellingProperty;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.google.common.base.Splitter;

/**
 * Imports <a href="https://www.islamware.com/app/downloads">IslamWare.com</a> hadith data using CP1256 character encoding.
 * 
 * <p>To reset all hadith:
 * 
 * <pre>
 * DELETE FROM sanad.authenticityproperty WHERE id LIKE 'hadith%';
 * DELETE FROM sanad.spellingproperty WHERE id LIKE 'hadith%';
 * DELETE FROM sanad.hadith;
 * DELETE FROM sanad.hadithcollection;
 * </pre>
 * 
 * @author ceefour
 */
@Configuration
@PropertySource("classpath:/META-INF/sanad.properties")
@EnableTransactionManagement
@Import(SanadConfig.class)
public class ImportHadithDatabase {
	
	private static final Charset CP1256 = Charset.forName("Cp1256");

	private static final Logger log = LoggerFactory
			.getLogger(ImportHadithDatabase.class);
	
	@PersistenceContext
	EntityManager em;
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ImportHadithDatabase.class)) {
			ImportHadithDatabase cmd = ctx.getBean(ImportHadithDatabase.class);
			cmd.persistAhadith(CP1256, "Hadith Sahih al-Bukhari", "Muhammad al-Bukhari",
					new File("/home/ceefour/git/hadith-islamware/hadith-sahih-bukhari.csv")); // 0: 7008
			cmd.persistAhadith(CP1256, "Hadith Sahih Muslim", "Muslim ibn al-Hajjaj", 
					new File("/home/ceefour/git/hadith-islamware/hadith-sahih-muslim.csv")); // 1: 5362
			cmd.persistAhadith(CP1256, "Hadith Sunan al-Tirmidhi", "Sunan al-Tirmidhi", 
					new File("/home/ceefour/git/hadith-islamware/hadith-sunan-al-tirmidhi.csv")); // 3891
			cmd.persistAhadith(CP1256, "Hadith Sunan al-Nasa'i", "Sunan al-Nasa'i", 
					new File("/home/ceefour/git/hadith-islamware/hadith-sunan-al-nasai.csv")); // 5662
			cmd.persistAhadith(CP1256, "Hadith Sunan Abu Dawud", "Sunan Abu Dawud", 
					new File("/home/ceefour/git/hadith-islamware/hadith-sunan-abu-dawud.csv")); // 4590
			cmd.persistAhadith(CP1256, "Hadith Sunan Ibn Maja", "Sunan Ibn Maja", 
					new File("/home/ceefour/git/hadith-islamware/hadith-sunan-ibn-maja.csv")); // 4332
			cmd.persistAhadith(CP1256, "Hadith Musnad Ahmad ibn Hanbal", "Musnad Ahmad ibn Hanbal", 
					new File("/home/ceefour/git/hadith-islamware/hadith-musnad-ahmad-ibn-hanbal.csv")); // 26363
			cmd.persistAhadith(CP1256, "Hadith Malik's Muwatta", "Malik's Muwatta", 
					new File("/home/ceefour/git/hadith-islamware/hadith-maliks-muwatta.csv")); // 1594
			cmd.persistAhadith(CP1256, "Hadith Sunan al-Darami", "Sunan al-Darami", 
					new File("/home/ceefour/git/hadith-islamware/hadith-sunan-al-darami.csv")); // 3367
		}
	}
	
	@Transactional
	public void persistAhadith(Charset charset, String collectionName, String authorName, File file) throws FileNotFoundException, IOException {
		HadithCollection coll = new HadithCollection();
		coll.setAuthor(authorName);
		coll.setId("hadithcollection_" + SlugUtils.generateId(collectionName));
		coll.setSlug(SlugUtils.generateSegment(coll.getId()));
		coll.setCanonicalSlug(SlugUtils.canonicalize(coll.getSlug()));
		coll.setInLanguage("ara");
		coll.setName(collectionName);
		coll.addToAuthenticities(new AuthenticityProperty(coll.getId() + "_authentic", Authenticity.AUTHENTIC));
		
		/**
		 * OpenCSV errors here: (Sahih al-Bukhari)
		 * 
		 * 06:45:47.795 [main] DEBUG o.s.s.c.i.ImportHadithDatabase - 6982 ‏ ‏��َدَّثَنِي ‏ ‏مُحَمَّدُ بْنُ عَبْدِ الرَّحِيمِ ‏ ‏حَدَّثَنَا ‏ ‏أَبُو زَيْدٍ سَعِيدُ بْنُ الرَّبِيعِ الْهَرَوِيُّ ‏ ‏حَدَّثَنَا ‏ ‏شُعْبَةُ ‏ ‏عَنْ ‏ ‏قَتَادَةَ ‏ ‏عَنْ ‏ ‏أَنَسٍ ‏ ‏رَضِيَ اللَّهُ عَنْهُ ‏ ‏عَنْ النَّبِيِّ ‏ ‏صَلَّى اللَّهُ عَلَيْهِ وَسَلَّمَ ‏ ‏يَرْوِيهِ عَنْ رَبِّهِ قَالَ ‏ ‏إِذَا تَقَرَّبَ الْعَبْدُ إِلَيَّ شِبْرًا تَقَرَّبْتُ إِلَيْهِ ذِرَاعًا وَإِذَا تَقَرَّبَ مِنِّي ذِرَاعًا تَقَرَّبْتُ مِنْهُ ‏ ‏بَاعًا ‏ ‏وَإِذَا أَتَانِي مَشْيًا أَتَيْتُهُ هَرْوَلَةً ‏
		 * 06:45:47.796 [main] DEBUG o.s.s.c.i.ImportHadithDatabase - 6986 ‏ ‏حَدَّثَنَا ‏ ‏أَحْمَدُ بْنُ أَبِي سُرَيْجٍ ‏ ‏أَخْبَرَنَا ‏ ‏شَبَابَةُ ‏ ‏حَدَّثَنَا ‏ ‏شُعْبَةُ ‏ ‏عَنْ ‏ ‏مُعَاوِيَةَ بْنِ قُرَّةَ ‏ ‏عَنْ ‏ ‏عَبْدِ اللَّهِ بْنِ مُغَفَّلٍ الْمُزَنِيِّ ‏ ‏قَالَ ‏ ‏رَأَيْتُ رَسُولَ اللَّهِ ‏ ‏صَلَّى اللَّهُ عَلَيْهِ وَسَلَّمَ ‏ ‏يَوْمَ الْفَتْحِ عَلَى نَاقَةٍ لَهُ يَقْرَأُ سُورَةَ الْفَتْحِ ‏ ‏أَوْ مِنْ سُورَةِ الْفَتْحِ ‏ ‏قَالَ ‏ ‏فَرَجَّعَ ‏ ‏فِيهَا قَالَ ثُمَّ قَرَأَ ‏ ‏مُعَاوِيَةُ ‏ ‏يَحْكِي قِرَاءَةَ ‏ ‏ابْنِ مُغَفَّلٍ ‏ ‏وَقَالَ لَوْلَا أَنْ يَجْتَمِعَ النَّاسُ عَلَيْكُمْ ‏ ‏لَرَجَّعْتُ ‏ ‏كَمَا ‏ ‏رَجَّعَ ‏ ‏ابْنُ مُغَفَّلٍ ‏ ‏يَحْكِي النَّبِيَّ ‏ ‏صَلَّى اللَّهُ عَلَيْهِ وَسَلَّمَ ‏ ‏فَقُلْتُ ‏ ‏لِمُعَاوِيَةَ ‏ ‏كَيْفَ كَانَ ‏ ‏تَرْجِيعُهُ ‏ ‏قَالَ آ آ آ ثَلَاثَ مَرَّاتٍ ‏
		 * 
		 */
//		try (CSVReader csv = new CSVReader(new InputStreamReader(new FileInputStream(file), charset), '|')) {
//			while (true) {
//				String[] row = csv.readNext();
//				if (row == null) {
//					break;
//				}
//				int collId = Integer.parseInt(row[0]);
//				int hadithNum = Integer.parseInt(row[1]);
//				String text = row[2];
//				log.debug("{} {}", hadithNum, text);
//			}
//		}
		
		final Splitter pipeSplitter = Splitter.on('|');
		try (BufferedReader br = IOUtils.toBufferedReader(new InputStreamReader(new FileInputStream(file), charset))) {
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				String[] row = pipeSplitter.splitToList(line).toArray(new String[] {});
				int collId = Integer.parseInt(row[0]);
				int hadithNum = Integer.parseInt(row[1]);
				String text = row[2];
				log.debug("Adding {} hadith {}", collectionName, hadithNum);
				
				Hadith hadith = new Hadith();
				hadith.setCollection(coll);
				hadith.setId(coll.getId() + "_hadith_" + hadithNum);
				hadith.setSlug(SlugUtils.generateSegment(hadith.getId()));
				hadith.setCanonicalSlug(SlugUtils.canonicalize(hadith.getId()));
				hadith.setInLanguage("ara");
				hadith.setName(collectionName + " hadith " + hadithNum);
				hadith.setHadithNum(hadithNum);
//				hadith.setAuthor(authorName);
				hadith.addToAuthenticities(new AuthenticityProperty(hadith.getId() + "_authentic", Authenticity.AUTHENTIC));
				Literal literal = new Literal();
				literal.setCreativeWork(hadith);
				literal.assignAdoc(text);
				literal.setId(hadith.getId() + "_text");
				literal.setInLanguage("ara");
				literal.addToSpellings(new SpellingProperty(literal.getId() + "_official", Spelling.OFFICIAL));
				hadith.addToTexts(literal);
				
				coll.addToHadiths(hadith);
			}
		}
		
		log.info("Persisting hadith collection {} with {} ahadith", 
				coll.getName(), coll.getHadiths().size());
		em.persist(coll);
	}

}
