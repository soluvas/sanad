package org.soluvas.sanad.core.mvc;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.sanad.core.jpa.Transliteration;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableMap;

/**
 * @author ceefour
 *
 */
@RestController
public class AnnotationController {

	private static final Logger log = LoggerFactory
			.getLogger(AnnotationController.class);
	
	public static class AnnotationResource extends ResourceSupport {
		public Map<String, AnnotationSection> sections;

		public AnnotationResource(Map<String, AnnotationSection> sections) {
			super();
			this.sections = sections;
		}
		
	}
	
	public static class AnnotationSection extends ResourceSupport {
		public List<Transliteration> transliterations;

		public AnnotationSection(List<Transliteration> transliterations) {
			super();
			this.transliterations = transliterations;
		}
	}
	
	@PersistenceContext
	EntityManager em;
	
	@RequestMapping("/annotation")
	public ResponseEntity<AnnotationResource> annotation(
		@RequestParam(value="normalized", required=true) String upNormalized) {
		log.debug("Annotation requested for: {}", upNormalized);
		
		String escapedNormalized = upNormalized.replace("%", "\\%").replace("_", "\\_");
		// no need to use ILIKE because already normalized
		List<Transliteration> tls = em.createQuery(
				"SELECT t FROM Transliteration t WHERE normalized LIKE '%' || :escapedNormalized || '%' ESCAPE '\\'",
				Transliteration.class)
				.setParameter("escapedNormalized", escapedNormalized)
				.setMaxResults(10)
				.getResultList();
		log.debug("{} transliterations for '{}': {}", tls.size(), upNormalized, tls);
		AnnotationResource annotationResp = new AnnotationResource(
				ImmutableMap.of("s0", new AnnotationSection(tls)));
		return new ResponseEntity<>(annotationResp, HttpStatus.OK);
	}
	
}
