package org.soluvas.sanad.core;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.soluvas.sanad.core.jpa.QuranChapter;
import org.springframework.transaction.annotation.Transactional;

public class QuranManager {

	@PersistenceContext
	EntityManager em;
	
	public static class QuranChapterSummary {
		private final int chapterNum;
		private final String name;
		private final String nameTransliteration;
		private final long verseCount;
		
		public QuranChapterSummary(int chapterNum, String name, String nameTransliteration, long verseCount) {
			super();
			this.chapterNum = chapterNum;
			this.name = name;
			this.nameTransliteration = nameTransliteration;
			this.verseCount = verseCount;
		}
		
		public int getChapterNum() {
			return chapterNum;
		}
		
		public String getName() {
			return name;
		}
		
		public String getNameTransliteration() {
			return nameTransliteration;
		}
		
		public long getVerseCount() {
			return verseCount;
		}
		
	}
	
	@Transactional(readOnly=true)
	public List<QuranChapterSummary> findAllChapterSummaries() {
		return em.createQuery("SELECT NEW org.soluvas.sanad.core.QuranManager$QuranChapterSummary(c.chapterNum, c.name, c.nameTransliteration, COUNT(v))"
				+ " FROM QuranChapter c LEFT JOIN c.verses v"
				+ " GROUP BY c.chapterNum, c.name, c.nameTransliteration"
				+ " ORDER BY c.chapterNum", QuranChapterSummary.class).getResultList();
	}

	@Transactional(readOnly=true)
	public QuranChapter findOneChapter(int chapterNum) {
		return em.createQuery("SELECT c FROM QuranChapter c"
				+ " LEFT JOIN FETCH c.verses v LEFT JOIN FETCH v.text LEFT JOIN FETCH v.transliteration"
				+ " WHERE c.chapterNum=:chapterNum", QuranChapter.class)
				.setParameter("chapterNum", chapterNum)
				.getSingleResult();
	}

}
