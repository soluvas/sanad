package org.soluvas.sanad.core;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.soluvas.commons.SlugUtils;
import org.soluvas.data.domain.Pageable;
import org.soluvas.data.domain.Sort.Order;
import org.soluvas.sanad.core.jpa.Hadith;
import org.soluvas.sanad.core.jpa.HadithCollection;
import org.springframework.transaction.annotation.Transactional;

public class HadithManager {

	@PersistenceContext
	EntityManager em;
	
	public static class HadithCollectionSummary {
		private final String slug;
		private final String name;
		private final String author;
		private final long hadithCount;
		
		public HadithCollectionSummary(String slug, String name, String author, long hadithCount) {
			super();
			this.slug = slug;
			this.name = name;
			this.author = author;
			this.hadithCount = hadithCount;
		}
		
		public String getSlug() {
			return slug;
		}
		
		public String getName() {
			return name;
		}
		
		public String getAuthor() {
			return author;
		}
		
		public long getHadithCount() {
			return hadithCount;
		}
		
	}
	
	@Transactional(readOnly=true)
	public List<HadithCollectionSummary> findAllCollectionSummaries() {
		return em.createQuery("SELECT NEW org.soluvas.sanad.core.HadithManager$HadithCollectionSummary(c.slug, c.name, c.author, COUNT(h))"
				+ " FROM HadithCollection c LEFT JOIN c.hadiths h"
				+ " GROUP BY c.slug, c.name, c.author"
				+ " ORDER BY c.slug", HadithCollectionSummary.class).getResultList();
	}

	@Transactional(readOnly=true)
	public HadithCollection findOneCollection(String upSlug) {
		String canonSlug = SlugUtils.canonicalize(upSlug);
		return em.createQuery("SELECT c FROM HadithCollection c"
				+ " WHERE c.canonicalSlug = :canonicalSlug", HadithCollection.class)
				.setParameter("canonicalSlug", canonSlug)
				.getSingleResult();
	}

	@Transactional(readOnly=true)
	public List<Hadith> findAllHadiths(String upSlug, Pageable pageable) {
		String canonSlug = SlugUtils.canonicalize(upSlug);
		final Order firstOrder = pageable.getSort().iterator().next();
		List<Hadith> hadiths = em.createQuery("SELECT h FROM Hadith h"
				// When you use “setMaxResults” and add a join fetch against a collection this will result in that
				// Hibernate fetches all entities from the database and applies the limit after everything has been fetched
//				+ " LEFT JOIN FETCH h.texts"
				+ " WHERE h.collection.canonicalSlug = :canonicalSlug"
				+ " ORDER BY h." + firstOrder.getProperty() + " " + firstOrder.getDirection(), Hadith.class)
				.setFirstResult((int) pageable.getOffset())
				.setMaxResults((int) pageable.getPageSize())
				.setParameter("canonicalSlug", canonSlug)
				.getResultList();
		for (Hadith hadith : hadiths) {
			hadith.getTexts().iterator();
		}
		return hadiths;
	}

	@Transactional(readOnly=true)
	public long getCollectionHadithCount(String upSlug) {
		String canonSlug = SlugUtils.canonicalize(upSlug);
		return em.createQuery("SELECT COUNT(h) FROM HadithCollection c LEFT JOIN c.hadiths h"
				+ " WHERE c.canonicalSlug = :canonicalSlug", Long.class)
				.setParameter("canonicalSlug", canonSlug)
				.getSingleResult();
	}

}
