package org.soluvas.sanad.core;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.soluvas.data.domain.Page;
import org.soluvas.data.domain.PageImpl;
import org.soluvas.data.domain.Pageable;
import org.soluvas.data.domain.Sort.Order;
import org.soluvas.sanad.core.jpa.Literal;
import org.soluvas.sanad.core.jpa.Testimony;
import org.soluvas.sanad.core.jpa.Thing;
import org.soluvas.sanad.core.jpa.Transliteration;
import org.springframework.transaction.annotation.Transactional;

/**
 * Manager bean for {@link Thing}s, {@link Literal}s, and {@link Transliteration}s.
 * @author ceefour
 */
public class ThingManager {

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
	public Page<Transliteration> findAllTransliterationsWithoutCreativeWork(Pageable pageable) {
		long tlCount = getTransliterationWithoutCreativeWorkCount();
		final Order firstOrder = pageable.getSort().iterator().next();
		List<Transliteration> tls = em.createQuery(
				"SELECT t FROM Transliteration t WHERE t.creativeWork IS NULL"
				+ " ORDER BY t." + firstOrder.getProperty() + " " + firstOrder.getDirection(),
				Transliteration.class).getResultList();
		// "eager" fetch
		for (Transliteration tl : tls) {
			tl.getSpellings().iterator();
		}
		return new PageImpl<>(tls, pageable, tlCount);
	}

	@Transactional(readOnly=true)
	public Page<Literal> findAllLiteralsWithoutCreativeWork(Pageable pageable) {
		long tlCount = getLiteralWithoutCreativeWorkCount();
		final Order firstOrder = pageable.getSort().iterator().next();
		List<Literal> tls = em.createQuery(
				"SELECT l FROM Literal l WHERE l.creativeWork IS NULL"
				+ " ORDER BY l." + firstOrder.getProperty() + " " + firstOrder.getDirection(),
				Literal.class).getResultList();
		return new PageImpl<>(tls, pageable, tlCount);
	}

	@Transactional(readOnly=true)
	public Testimony findOneTestimony(String id) {
		return em.createQuery("SELECT t FROM Testimony t"
				+ " WHERE t.id = :id", Testimony.class)
				.setParameter("id", id)
				.getSingleResult();
	}

//	@Transactional(readOnly=true)
//	public Page<Claim> findAllClaims(Pageable pageable) {
//		long claimCount = getClaimCount();
//		final Order firstOrder = pageable.getSort().iterator().next();
//		List<Claim> claims = em.createQuery("SELECT c FROM Claim c"
//				// When you use “setMaxResults” and add a join fetch against a collection this will result in that
//				// Hibernate fetches all entities from the database and applies the limit after everything has been fetched
////				+ " LEFT JOIN FETCH h.texts"
////				+ " WHERE h.collection.canonicalSlug = :canonicalSlug"
//				/*+ " ORDER BY t." + firstOrder.getProperty() + " " + firstOrder.getDirection()*/,
//				Claim.class)
//				.setFirstResult((int) pageable.getOffset())
//				.setMaxResults((int) pageable.getPageSize())
//				.getResultList();
////		for (Hadith hadith : hadiths) {
////			hadith.getTexts().iterator();
////		}
//		return new PageImpl<>(claims, pageable, claimCount);
//	}

	@Transactional(readOnly=true)
	public long getTestimonyClaimCount(String id) {
		return em.createQuery("SELECT COUNT(c) FROM Testimony t LEFT JOIN t.claims c"
				+ " WHERE t.id = :id", Long.class)
				.setParameter("id", id)
				.getSingleResult();
	}

	@Transactional(readOnly=true)
	public long getAllTransliterationCount() {
		return em.createQuery("SELECT COUNT(tl) FROM Transliteration tl", Long.class).getSingleResult();		
	}

	@Transactional(readOnly=true)
	public long getTransliterationWithoutCreativeWorkCount() {
		return em.createQuery("SELECT COUNT(tl) FROM Transliteration tl WHERE tl.creativeWork IS NULL", Long.class).getSingleResult();		
	}

	@Transactional(readOnly=true)
	public long getAllLiteralCount() {
		return em.createQuery("SELECT COUNT(l) FROM Literal l", Long.class).getSingleResult();		
	}

	@Transactional(readOnly=true)
	public long getLiteralWithoutCreativeWorkCount() {
		return em.createQuery("SELECT COUNT(l) FROM Literal l WHERE tl.creativeWork IS NULL", Long.class).getSingleResult();		
	}

	@Transactional(readOnly=true)
	public Transliteration findOneTransliteration(String id) {
		return em.createQuery("SELECT tl"
				+ " FROM Transliteration tl LEFT JOIN FETCH tl.spellings"
				+ " WHERE tl.id = :id", Transliteration.class)
				.setParameter("id", id)
				.getSingleResult();
	}
	
	@Transactional(readOnly=true)
	public Literal findOneLiteral(String id) {
		return em.createQuery("SELECT l"
				+ " FROM Literal l LEFT JOIN FETCH l.spellings"
				+ " WHERE l.id = :id", Literal.class)
				.setParameter("id", id)
				.getSingleResult();
	}
	
}
