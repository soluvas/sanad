package org.soluvas.sanad.core.mvc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.sanad.core.jpa.Transliteration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ceefour
 *
 */
@RestController
public class AnnotationController {

	private static final Logger log = LoggerFactory
			.getLogger(AnnotationController.class);
	
	public static class AnnotationResponse {
		public List<Transliteration> transliterations;

		public AnnotationResponse(List<Transliteration> transliterations) {
			super();
			this.transliterations = transliterations;
		}
		
	}
	
	@PersistenceContext
	EntityManager em;
	
	@RequestMapping("/annotation")
	public ResponseEntity<AnnotationResponse> annotation(
		@RequestParam(value="normalized", required=true) String upNormalized) {
		log.debug("Annotation requested for: {}", upNormalized);
		List<Transliteration> tls = em.createQuery("SELECT t FROM Transliteration t", Transliteration.class).getResultList();
		log.debug("Annotation for '{}': {}", upNormalized, tls);
		AnnotationResponse annotationResp = new AnnotationResponse(tls);
		return new ResponseEntity<>(annotationResp, HttpStatus.OK);
	}
	
}
