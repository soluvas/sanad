package org.soluvas.sanad.core;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.json.JsonUtils;
import org.soluvas.sanad.core.jpa.Spelling;
import org.soluvas.sanad.core.jpa.SpellingProperty;
import org.soluvas.sanad.core.jpa.Transliteration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SanadConfig.class, initializers=PropertyMockingApplicationContextInitializer.class)
public class TransliterationDataTest {

	private static final Logger log = LoggerFactory
			.getLogger(TransliterationDataTest.class);
	
	@PersistenceContext
	EntityManager em;
	@Inject
	PlatformTransactionManager txMgr;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test @Transactional
	public void hasTransliterations() {
		List<Transliteration> transliterations = em.createQuery("SELECT t FROM Transliteration t", Transliteration.class)
				.setMaxResults(10).getResultList();
		log.info("Transliterations: {}", transliterations);
		assertThat(transliterations, hasSize(greaterThanOrEqualTo(1)));
	}
	
	@Test
	public void addOneSpelling() {
		new TransactionTemplate(txMgr).execute((tx) -> {
			Transliteration tl = em.find(Transliteration.class, UUID.fromString("6716d949-cfde-4911-8efc-d058a286b1f5"));
			final SpellingProperty spelling = new SpellingProperty();
			spelling.setDescription("ini budi");
			spelling.setSpelling(Spelling.OFFICIAL);
			tl.addToSpellings(spelling);
			return null;
		});
	}

	@Test
	public void addAllSpellings() {
		new TransactionTemplate(txMgr).execute((tx) -> {
			List<Transliteration> tls = em.createQuery("SELECT t FROM Transliteration t", Transliteration.class).getResultList();
			for (Transliteration tl : tls) {
				final SpellingProperty spelling = new SpellingProperty();
				spelling.setDescription(tl.getNormalized());
				spelling.setSpelling(Spelling.OFFICIAL);
				tl.addToSpellings(spelling);
			}
			return null;
		});
	}

	@Test @Transactional
	public void transliterationsToJson() {
		List<Transliteration> transliterations = em.createQuery("SELECT t FROM Transliteration t", Transliteration.class).getResultList();
		log.info("Transliterations: {}", transliterations);
		System.out.println(JsonUtils.asJson(transliterations));
	}
	
}
