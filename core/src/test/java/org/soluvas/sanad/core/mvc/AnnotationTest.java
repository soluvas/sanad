package org.soluvas.sanad.core.mvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.sanad.core.PropertyMockingApplicationContextInitializer;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes=SanadMvcConfig.class, initializers=PropertyMockingApplicationContextInitializer.class)
public class AnnotationTest {

	private static final Logger log = LoggerFactory
			.getLogger(AnnotationTest.class);
	
	@PersistenceContext
	EntityManager em;
	@Inject
	PlatformTransactionManager txMgr;
	@Inject
	WebApplicationContext wac;
	
	MockMvc mockMvc;
	
	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test @Transactional
	public void hasTransliterations() throws Exception {
		ResultActions actions = mockMvc.perform(get("/annotation")
				.param("normalized", "taqobbalallahu minna wa minkum")
				.accept(MediaType.APPLICATION_JSON));
		MvcResult result = actions.andReturn();
		log.info("Status: {}", result.getResponse().getStatus());
		log.info("Type: {}", result.getResponse().getContentType());
		log.info("Content: {}", result.getResponse().getContentAsString());
		actions.andExpect(status().isOk())
			.andExpect(content().contentType("application/json;charset=UTF-8"))
			.andExpect(jsonPath("$.transliterations").isArray())
			.andExpect(jsonPath("$.spelling").value("formal"));
	}
	
}
