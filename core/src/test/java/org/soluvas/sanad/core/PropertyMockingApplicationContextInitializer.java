package org.soluvas.sanad.core;

import java.io.File;

import org.soluvas.commons.TenantSource;
import org.soluvas.commons.tenant.RequestOrCommandScope;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.mock.env.MockPropertySource;
import org.springframework.web.context.WebApplicationContext;

import com.google.common.collect.ImmutableMap;

/**
 * Used for testing, but have to be in {@code src/main/java} because depended by other projects.
 * <p>http://blog.jamesdbloom.com/UsingPropertySourceAndEnvironment.html
 * @author atang
 * @see AppInitializer
 */
public class PropertyMockingApplicationContextInitializer implements
		ApplicationContextInitializer<ConfigurableApplicationContext> {

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		MutablePropertySources propertySources = applicationContext
				.getEnvironment().getPropertySources();
		MockPropertySource mockEnvVars = new MockPropertySource()
			// PostgresConfig
			.withProperty("sqlUrl", "jdbc:postgresql://localhost/sanad_sanad_dev")
			.withProperty("sqlUser", "postgres")
			.withProperty("sqlPassword", "bippo")
			.withProperty("jpaHbm2DdlAuto", "update")
			// Multitenancy
			.withProperty("tenantEnv", "dev")
			.withProperty("workspaceDir", new File(System.getProperty("user.home"), "sanad_sanad_dev"))
			.withProperty("tenantId", "sanad")
			.withProperty("tenantSource", TenantSource.CONFIG);
		propertySources.replace(
				StandardEnvironment.SYSTEM_ENVIRONMENT_PROPERTY_SOURCE_NAME,
				mockEnvVars);
		
		final CustomScopeConfigurer scopeConfigurer = new CustomScopeConfigurer();
		scopeConfigurer.setScopes(ImmutableMap.<String, Object>of(WebApplicationContext.SCOPE_REQUEST, new RequestOrCommandScope()));
		applicationContext.addBeanFactoryPostProcessor(scopeConfigurer);
	}

}
