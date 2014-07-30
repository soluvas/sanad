package org.soluvas.sanad.core.mvc;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.sanad.core.jpa.Transliteration;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * @author ceefour
 *
 */
@RestController
@Api(value="annotation", description="Sanad Authenticity Annotation Service")
public class AnnotationController {

	private static final Logger log = LoggerFactory
			.getLogger(AnnotationController.class);
	
	public static class AnnotationResource extends ResourceSupport {
		public List<AnnotationSection> sections;

		public AnnotationResource(List<AnnotationSection> sections) {
			super();
			this.sections = sections;
		}
		
	}
	
	public static class AnnotationSection {
		public List<Transliteration> transliterations;

		public AnnotationSection(List<Transliteration> transliterations) {
			super();
			this.transliterations = transliterations;
		}
	}
	
	@PersistenceContext
	EntityManager em;
	
	@RequestMapping(value = "/annotation", method={RequestMethod.GET, RequestMethod.POST})
	@ApiOperation(value="Annotate texts",
		notes="Annotate one or more sections of text with authenticity information.")
	@Transactional
	public AnnotationResource annotation(
		@RequestParam(value="normalized", required=true) List<String> upNormalizeds) {
		log.debug("Annotation requested for: {}", upNormalizeds);
		
		List<AnnotationSection> sections = new ArrayList<>();
		for (int i = 0; i < upNormalizeds.size(); i++) {
			String upNormalized = upNormalizeds.get(i);
//			String escapedNormalized = upNormalized.replace("%", "\\%").replace("_", "\\_");
			// no need to use ILIKE because already normalized
			List<Transliteration> tls = em.createQuery(
					"SELECT t FROM Transliteration t"
					+ " LEFT JOIN FETCH t.spellings ss LEFT JOIN FETCH ss.claims"
					+ " WHERE :upNormalized LIKE '%' || normalized || '%' ESCAPE '\\'",
					Transliteration.class)
					.setParameter("upNormalized", upNormalized)
					.setMaxResults(10)
					.getResultList();
			log.debug("{} transliterations for '{}': {}", tls.size(), upNormalized, tls);
			sections.add(new AnnotationSection(tls));
		}
		AnnotationResource annotationResp = new AnnotationResource(sections);
		return annotationResp;
	}
	
}
