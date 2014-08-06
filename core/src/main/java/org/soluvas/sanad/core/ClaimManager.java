package org.soluvas.sanad.core;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.soluvas.data.domain.Page;
import org.soluvas.data.domain.PageImpl;
import org.soluvas.data.domain.Pageable;
import org.soluvas.data.domain.Sort.Order;
import org.soluvas.jpa.jpa.PersonInfo;
import org.soluvas.sanad.core.jpa.Claim;
import org.soluvas.sanad.core.jpa.Testimony;
import org.springframework.transaction.annotation.Transactional;

/**
 * Manager bean for {@link Testimony}s and {@link Claim}s.
 * @author ceefour
 */
public class ClaimManager {

	public static class TestimonySummary implements Serializable {
		private static final long serialVersionUID = 1L;
		private final UUID id;
		private final String description;
		private final PersonInfo person;
		private final DateTime creationTime;
		private final LocalDate validStartDate;
		private final LocalDate validEndDate;
		private final DateTime validStartTime;
		private final DateTime validEndTime;
		private final long claimCount;
		
		public TestimonySummary(UUID id, String description, PersonInfo person,
				DateTime creationTime, LocalDate validStartDate,
				LocalDate validEndDate, DateTime validStartTime,
				DateTime validEndTime, long claimCount) {
			super();
			this.id = id;
			this.description = description;
			this.person = person;
			this.creationTime = creationTime;
			this.validStartDate = validStartDate;
			this.validEndDate = validEndDate;
			this.validStartTime = validStartTime;
			this.validEndTime = validEndTime;
			this.claimCount = claimCount;
		}

		public UUID getId() {
			return id;
		}

		public String getDescription() {
			return description;
		}

		public PersonInfo getPerson() {
			return person;
		}

		public DateTime getCreationTime() {
			return creationTime;
		}

		public LocalDate getValidStartDate() {
			return validStartDate;
		}

		public LocalDate getValidEndDate() {
			return validEndDate;
		}

		public DateTime getValidStartTime() {
			return validStartTime;
		}

		public DateTime getValidEndTime() {
			return validEndTime;
		}

		public long getClaimCount() {
			return claimCount;
		}
		
	}
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional(readOnly=true)
	public Page<TestimonySummary> findAllTestimonySummaries(Pageable pageable) {
		long testimonyCount = getTestimonyCount();
		final Order firstOrder = pageable.getSort().iterator().next();
		List<TestimonySummary> summaries = em.createQuery(
				"SELECT NEW org.soluvas.sanad.core.ClaimManager$TestimonySummary(t.id, t.description, t.person, t.creationTime, t.validStartDate, t.validEndDate, t.validStartTime, t.validEndTime, COUNT(c))"
				+ " FROM Testimony t LEFT JOIN c.claims c"
				+ " GROUP BY t.id, t.description, t.personId, t.creationTime, t.validStartDate, t.validEndDate, t.validStartTime, t.validEndTime"
				+ " ORDER BY t." + firstOrder.getProperty() + " " + firstOrder.getDirection(),
				TestimonySummary.class).getResultList();
		return new PageImpl<>(summaries, pageable, testimonyCount);
	}

	@Transactional(readOnly=true)
	public Testimony findOneTestimony(UUID id) {
		return em.createQuery("SELECT t FROM Testimony t LEFT JOIN FETCH t.claims"
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

	@Transactional(readOnly=true)
	public long getTestimonyCount() {
		return em.createQuery("SELECT COUNT(t) FROM Testimony t", Long.class).getSingleResult();
	}
	
	@Transactional
	public Testimony addTestimony(Testimony testimony) {
		return em.merge(testimony);
	}

}
