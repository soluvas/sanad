package org.soluvas.sanad.core;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.sanad.core.jpa.Transliteration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SanadConfig.class, initializers=PropertyMockingApplicationContextInitializer.class)
public class TransliterationDataTest {

	private static final Logger log = LoggerFactory
			.getLogger(TransliterationDataTest.class);
	
	@PersistenceContext
	EntityManager em;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test @Transactional
	public void hasTransliterations() {
		List<Transliteration> transliterations = em.createQuery("SELECT t FROM Transliteration t", Transliteration.class).getResultList();
		log.info("Transliterations: {}", transliterations);
		assertThat(transliterations, hasSize(greaterThanOrEqualTo(1)));
	}

}
