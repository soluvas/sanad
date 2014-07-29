package org.soluvas.sanad.core;

import java.beans.PropertyVetoException;
import java.util.Map;

import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.hibernate.cfg.DefaultComponentSafeNamingStrategy;
import org.hibernate.dialect.PostgreSQL9Dialect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.jpa.JpaConfig;
import org.soluvas.jpa.SoluvasMultiTenantConnectionProviderImpl;
import org.soluvas.jpa.SoluvasTenantIdentifierResolver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.google.common.collect.ImmutableMap;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @author ceefour
 *
 */
@Configuration
@EnableTransactionManagement
@Import(JpaConfig.class)
public class SanadConfig {

	@Configuration
	public static class SqlConfig {
		
		public static final String POSTGRESQL_DRIVER = "org.postgresql.Driver";
		private static final Logger log = LoggerFactory
				.getLogger(SanadConfig.SqlConfig.class);
		
		/**
		  * We use {@link Environment#getRequiredProperty(String)} because the
		  * sqlUrl, sqlUser, and sqlPassword are app-scoped configuration,
		  * since we use SCHEMA-based multitenancy.
		  */
		@Inject
		private Environment env;
		@Inject
		private ApplicationContext appCtx;
//		@Inject
//		private DataSource dataSource;
//		@Inject
//		private EntityManagerFactory entityManagerFactory;
		
		@PreDestroy
		public void destroy() {
			SoluvasMultiTenantConnectionProviderImpl.dataSource = null;
			SoluvasTenantIdentifierResolver.appCtx = null;
		}
		
		@Bean(destroyMethod="close")
		public ComboPooledDataSource dataSource() throws PropertyVetoException {
			final String jdbcUrl = env.getRequiredProperty("sqlUrl");
			final String jdbcUser = env.getRequiredProperty("sqlUser");
			final String jdbcPassword = env.getRequiredProperty("sqlPassword");
			log.info("Initializing c3p0 Connection Pool to {} as '{}'", jdbcUrl, jdbcUser);
			final ComboPooledDataSource cpds = new ComboPooledDataSource();
			try {
				cpds.setDriverClass(POSTGRESQL_DRIVER);
			} catch (PropertyVetoException e) {
				throw new RuntimeException("Cannot load PostgreSQL driver " + POSTGRESQL_DRIVER + ": " + e, e);
			}
			
//			cpds.setConnectionCustomizerClassName(SoluvasConnectionCustomizer.class.getName());
			cpds.setAutoCommitOnClose(false);
			cpds.setJdbcUrl(jdbcUrl);
			cpds.setUser(jdbcUser);
			cpds.setPassword(jdbcPassword);
			cpds.setTestConnectionOnCheckin(true);
			return cpds;
		}
		
		@Bean(name="sanadPU")
		public LocalContainerEntityManagerFactoryBean sanadPU() throws PropertyVetoException {
			// Workaround :(
			SoluvasMultiTenantConnectionProviderImpl.dataSource = dataSource();
			SoluvasTenantIdentifierResolver.appCtx = appCtx;
			
			/**
			  * So the list of possible options are,
			  *  
			  *     validate: validate the schema, makes no changes to the database. 
			  *     update: update the schema. 
			  *     create: creates the schema, destroying previous data. 
			  *     create-drop: drop the schema at the end of the session. 
			  */
			final String jpaHbm2DdlAuto = env.getRequiredProperty("jpaHbm2DdlAuto");
			log.info("JPA schema configuration: hbm2ddlauto={}", jpaHbm2DdlAuto);
			final LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
			factoryBean.setPersistenceUnitName("sanadPU"); // persistence.xml
			factoryBean.setDataSource(dataSource());
			factoryBean.setJpaVendorAdapter(jpaVendorAdapter());
			factoryBean.setPersistenceXmlLocation("classpath*:META-INF/donotparsepersistence.xml");
//			factoryBean.setPersistenceUnitManager(new DefaultPersistenceUnitManager().set);
			factoryBean.setPackagesToScan("org.soluvas.sanad");
			final ImmutableMap.Builder<String, Object> propb = ImmutableMap.builder();
			// hbm2ddl.auto not supported with multitenancy: https://forum.hibernate.org/viewtopic.php?p=2468078
			propb.put(org.hibernate.cfg.Environment.HBM2DDL_AUTO, jpaHbm2DdlAuto);
		    // Must be supplied, otherwise you won't get JPA 2.1 @Index support
		    // "You must specify a SQL Dialect via the hibernate.dialect property when using schema generation"
			propb.put(org.hibernate.cfg.Environment.DIALECT, PostgreSQL9Dialect.class.getName());
			// Write all SQL statements to the <b>console</b> (which we don't want, since we use shell). 
			// This is an alternative to setting the log category org.hibernate.SQL to debug.
			// So please configure via logback.xml instead.
			propb.put(org.hibernate.cfg.Environment.SHOW_SQL, false);
			propb.put(org.hibernate.cfg.Environment.FORMAT_SQL, true);
			propb.put(org.hibernate.cfg.Environment.USE_SQL_COMMENTS, true);
			// https://hibernate.atlassian.net/browse/ANN-99?focusedCommentId=22432&page=com.atlassian.jira.plugin.system.issuetabpanels:comment-tabpanel#comment-22432
			propb.put(org.hibernate.ejb.HibernatePersistence.NAMING_STRATEGY, DefaultComponentSafeNamingStrategy.class.getName());
			// Schema-based Multi-tenancy
			// http://docs.jboss.org/hibernate/core/4.2/devguide/en-US/html/ch16.html
			// https://community.jboss.org/message/838997
//			propb.put(org.hibernate.cfg.Environment.MULTI_TENANT, 
//					MultiTenancyStrategy.SCHEMA);
//			propb.put(org.hibernate.cfg.Environment.MULTI_TENANT_CONNECTION_PROVIDER, 
//					SoluvasMultiTenantConnectionProviderImpl.class);
//			propb.put(org.hibernate.cfg.Environment.MULTI_TENANT_IDENTIFIER_RESOLVER,
//					SoluvasTenantIdentifierResolver.class);
			final Map<String, Object> propertyMap = propb.build();
			factoryBean.setJpaPropertyMap(propertyMap);
			return factoryBean;
		}

		@Bean
		public JpaVendorAdapter jpaVendorAdapter() {
			return new HibernateJpaVendorAdapter();
		}

//		@Bean
//		public JpaTransactionManager transactionManager() throws Exception {
//			return new JpaTransactionManager(entityManagerFactory);
//		}
		
		@Bean @Primary
		public JpaTransactionManager transactionManager() throws Exception {
			return new JpaTransactionManager(sanadPU().getObject());
		}
		
		@Bean
		public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
			return new PersistenceExceptionTranslationPostProcessor();
		}

	}
	
}
