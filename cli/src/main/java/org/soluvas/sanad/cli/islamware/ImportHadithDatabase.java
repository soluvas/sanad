package org.soluvas.sanad.cli.islamware;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Optional;

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
 * <p>Importing takes ~2 minutes on SATA i5.
 * 
 * <p>To reset all hadith: (~23 minutes on SATA i5)
 * (<a href="http://www.postgresql.org/docs/9.3/static/indexes-opclass.html">why varchar_pattern_ops is needed</a>)
 * 
 * <pre>
 * CREATE INDEX authenticityproperty_id_idx ON sanad.authenticityproperty (id varchar_pattern_ops);
 * CREATE INDEX spellingproperty_id_idx ON sanad.spellingproperty (id varchar_pattern_ops);
 * CREATE INDEX literal_id_idx ON sanad.literal (id varchar_pattern_ops);
 * CREATE INDEX transliteration_id_idx ON sanad.transliteration (id varchar_pattern_ops);
 * DELETE FROM sanad.authenticityproperty WHERE id LIKE 'hadith%';
 * DELETE FROM sanad.spellingproperty WHERE id LIKE 'hadith%';
 * DELETE FROM sanad.literal WHERE id LIKE 'hadith%';
 * DELETE FROM sanad.transliteration WHERE id LIKE 'hadith%';
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
			cmd.persistAhadith(CP1256, "Sahih al-Bukhari", "Abū ‘Abd Allāh Muḥammad ibn Ismā‘īl ibn Ibrāhīm ibn al-Mughīrah ibn Bardizbah al-Ju‘fī al-Bukhārī",
					Optional.of(Authenticity.AUTHENTIC),
					new File("/home/ceefour/git/hadith-islamware/hadith-sahih-bukhari.csv")); // 0: 7008
			cmd.persistAhadith(CP1256, "Sahih Muslim", "Abū al-Ḥusayn ‘Asākir ad-Dīn Muslim ibn al-Ḥajjāj ibn Muslim ibn Ward ibn Kawshādh al-Qushayrī an-Naysābūrī",
					Optional.of(Authenticity.AUTHENTIC),
					new File("/home/ceefour/git/hadith-islamware/hadith-sahih-muslim.csv")); // 1: 5362
			cmd.persistAhadith(CP1256, "Jāmi` at-Tirmidhī", "Abu `Isa Muhammad ibn `Isa at-Tirmidhi", 
					Optional.empty(), new File("/home/ceefour/git/hadith-islamware/hadith-sunan-al-tirmidhi.csv")); // 3891
			cmd.persistAhadith(CP1256, "Sunan al-Nasā'ī", "Aḥmad ibn Shu`ayb ibn Alī ibn Sīnān Abū `Abd ar-Raḥmān al-Nasā'ī", 
					Optional.empty(), new File("/home/ceefour/git/hadith-islamware/hadith-sunan-al-nasai.csv")); // 5662
			cmd.persistAhadith(CP1256, "Sunan Abu Dawud", "Abu Dawud Sulaymān ibn al-Ashʿath al-Azdi as-Sijistani", 
					Optional.empty(), new File("/home/ceefour/git/hadith-islamware/hadith-sunan-abu-dawud.csv")); // 4590
			cmd.persistAhadith(CP1256, "Sunan Ibn Mājah", "Abū ʻAbdillāh Muḥammad ibn Yazīd Ibn Mājah al-Rabʻī al-Qazwīn", 
					Optional.empty(), new File("/home/ceefour/git/hadith-islamware/hadith-sunan-ibn-maja.csv")); // 4332
			cmd.persistAhadith(CP1256, "Musnad Ahmad ibn Hanbal", "Ahmad bin Muhammad bin Hanbal Abu `Abd Allah al-Shaybani", 
					Optional.empty(), new File("/home/ceefour/git/hadith-islamware/hadith-musnad-ahmad-ibn-hanbal.csv")); // 26363
			cmd.persistAhadith(CP1256, "Al-Muwaṭṭaʾ Imam Mālik", "Mālik ibn Anas ibn Mālik ibn Abī 'Āmir al-Asbahī", 
					Optional.empty(), new File("/home/ceefour/git/hadith-islamware/hadith-maliks-muwatta.csv")); // 1594
			cmd.persistAhadith(CP1256, "Sunan al-Darimi", "`Abd Allah ibn `Abd al-Rahman al-Darimi", 
					Optional.empty(), new File("/home/ceefour/git/hadith-islamware/hadith-sunan-al-darimi.csv")); // 3367
		}
	}
	
	@Transactional
	public void persistAhadith(Charset charset, String collectionName, String authorName, Optional<Authenticity> authenticity, File file) throws FileNotFoundException, IOException {
		HadithCollection coll = new HadithCollection();
		coll.setAuthor(authorName);
		coll.setId("hadithcollection_" + SlugUtils.generateId(collectionName));
		coll.setSlug(SlugUtils.generateSegment(coll.getId()));
		coll.setCanonicalSlug(SlugUtils.canonicalize(coll.getSlug()));
		coll.setInLanguage("ar");
		coll.setName(collectionName);
		if (authenticity.isPresent()) {
			coll.addToAuthenticities(new AuthenticityProperty(coll.getId() + "_" + authenticity.get().getLiteral(),
					authenticity.get()));
		}
		
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
		
		log.info("Adding hadith collection {} from {}...", coll.getName(), file);

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
				log.trace("Adding {} hadith {}", collectionName, hadithNum);
				
				Hadith hadith = new Hadith();
				hadith.setCollection(coll);
				hadith.setId(coll.getId() + "_hadith_" + hadithNum);
				hadith.setSlug(SlugUtils.generateSegment(hadith.getId()));
				hadith.setCanonicalSlug(SlugUtils.canonicalize(hadith.getId()));
				hadith.setInLanguage("ar");
				hadith.setName(collectionName + " hadith " + hadithNum);
				hadith.setHadithNum(hadithNum);
//				hadith.setAuthor(authorName);
				if (authenticity.isPresent()) {
					hadith.addToAuthenticities(new AuthenticityProperty(hadith.getId() + "_"  + authenticity.get().getLiteral(),
							authenticity.get()));
				}
				Literal literal = new Literal();
				literal.setCreativeWork(hadith);
				literal.assignAdoc(text);
				literal.setId(hadith.getId() + "_text");
				literal.setInLanguage("ar");
				literal.addToSpellings(new SpellingProperty(literal.getId() + "_official", Spelling.OFFICIAL));
				hadith.addToTexts(literal);
				
				coll.addToHadiths(hadith);
			}
		}
		
		log.info("Persisting hadith collection {} with {} ahadith...", 
				coll.getName(), coll.getHadiths().size());
		em.persist(coll);
	}

}
