package org.soluvas.sanad.core;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.soluvas.data.domain.Page;
import org.soluvas.data.domain.PageImpl;
import org.soluvas.data.domain.Pageable;
import org.soluvas.data.domain.Sort.Order;
import org.soluvas.sanad.core.jpa.Claim;
import org.soluvas.sanad.core.jpa.Testimony;
import org.springframework.transaction.annotation.Transactional;

/**
 * Manager bean for {@link Testimony}s and {@link Claim}s.
 * @author ceefour
 */
public class ClaimManager {

	public static class TestimonySummary {
		private final String slug;
		private final String name;
		private final String author;
		private final long hadithCount;
		
		public TestimonySummary(String slug, String name, String author, long hadithCount) {
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
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional(readOnly=true)
	public Page<TestimonySummary> findAllTestimonySummaries(Pageable pageable) {
		long testimonyCount = em.createQuery("SELECT COUNT(t) FROM Testimony t", Long.class).getSingleResult();
		final Order firstOrder = pageable.getSort().iterator().next();
		List<TestimonySummary> summaries = em.createQuery(
				"SELECT NEW org.soluvas.sanad.core.ClaimManager$TestimonySummary(c.slug, c.name, c.author, COUNT(h))"
				+ " FROM Testimony t LEFT JOIN c.hadiths h"
				+ " GROUP BY c.slug, c.name, c.author"
				+ " ORDER BY t." + firstOrder.getProperty() + " " + firstOrder.getDirection(),
				TestimonySummary.class).getResultList();
		return new PageImpl<>(summaries, pageable, testimonyCount);
	}

	@Transactional(readOnly=true)
	public Testimony findOneTestimony(String id) {
		return em.createQuery("SELECT t FROM Testimony t"
				+ " WHERE t.id = :id", Testimony.class)
				.setParameter("id", id)
				.getSingleResult();
	}

	@Transactional(readOnly=true)
	public Page<Claim> findAllClaims(Pageable pageable) {
		long claimCount = getClaimCount();
		final Order firstOrder = pageable.getSort().iterator().next();
		List<Claim> claims = em.createQuery("SELECT c FROM Claim c"
				// When you use “setMaxResults” and add a join fetch against a collection this will result in that
				// Hibernate fetches all entities from the database and applies the limit after everything has been fetched
//				+ " LEFT JOIN FETCH h.texts"
//				+ " WHERE h.collection.canonicalSlug = :canonicalSlug"
				/*+ " ORDER BY t." + firstOrder.getProperty() + " " + firstOrder.getDirection()*/,
				Claim.class)
				.setFirstResult((int) pageable.getOffset())
				.setMaxResults((int) pageable.getPageSize())
				.getResultList();
//		for (Hadith hadith : hadiths) {
//			hadith.getTexts().iterator();
//		}
		return new PageImpl<>(claims, pageable, claimCount);
	}

	@Transactional(readOnly=true)
	public long getTestimonyClaimCount(String id) {
		return em.createQuery("SELECT COUNT(c) FROM Testimony t LEFT JOIN t.claims c"
				+ " WHERE t.id = :id", Long.class)
				.setParameter("id", id)
				.getSingleResult();
	}

	@Transactional(readOnly=true)
	public long getClaimCount() {
		return em.createQuery("SELECT COUNT(c) FROM Claim c", Long.class).getSingleResult();
	}

}
