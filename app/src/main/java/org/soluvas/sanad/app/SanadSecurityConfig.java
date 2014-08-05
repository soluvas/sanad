package org.soluvas.sanad.app;

import java.util.Collection;

import javax.inject.Inject;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.AggregatingSupplier;
import org.soluvas.commons.AppManifest;
import org.soluvas.commons.OnDemandXmiLoader;
import org.soluvas.commons.tenant.TenantBeans;
import org.soluvas.security.AccessControlManager;
import org.soluvas.security.AccessControlManagerImpl;
import org.soluvas.security.SecurityCatalog;
import org.soluvas.security.SecurityFactory;
import org.soluvas.security.SecurityPackage;
import org.soluvas.security.mongo.MongoRealm;
import org.soluvas.security.mongo.MongoRolePersonRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.damnhandy.uri.template.MalformedUriTemplateException;
import com.damnhandy.uri.template.UriTemplate;
import com.damnhandy.uri.template.VariableExpansionException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/**
 * @author ceefour
 */
@Configuration
@ComponentScan("org.soluvas.security.shell")
public class SanadSecurityConfig {

	private static final Logger log = LoggerFactory
			.getLogger(SanadSecurityConfig.class);
	
	@Inject
	private Environment env;
	
	@Bean
	public SecurityCatalog securityCatalog() {
		final AggregatingSupplier<SecurityCatalog> securityCatalogSupplier = new AggregatingSupplier<>(SecurityFactory.eINSTANCE,
				SecurityPackage.Literals.SECURITY_CATALOG, ImmutableList.of(
						new OnDemandXmiLoader<>(SecurityPackage.eINSTANCE, SecurityPackage.class, "default.SecurityCatalog.xmi")
					));
		final SecurityCatalog securityCatalog = securityCatalogSupplier.get();
		securityCatalog.validate();
		return securityCatalog;
	}
	
	@Bean
	public TenantBeans<MongoRolePersonRepository> rolePersonRepoBeans() {
		return new TenantBeans<MongoRolePersonRepository>(MongoRolePersonRepository.class) {
			@Override
			protected MongoRolePersonRepository create(String tenantId, AppManifest appManifest) throws Exception {
				final String tenantEnv = env.getRequiredProperty("tenantEnv");
				final String mongoUriTemplate = env.getRequiredProperty("mongoUriTemplate");
				String mongoUri = UriTemplate.fromTemplate(mongoUriTemplate).expand(ImmutableMap.of("tenantId", tenantId, "tenantEnv", tenantEnv));
				final MongoRolePersonRepository rolePersonRepo = new MongoRolePersonRepository(mongoUri);
				return rolePersonRepo;
			}
		};
	};
	
	@Bean
	public AccessControlManager accessControlMgr() {
		return new AccessControlManagerImpl(rolePersonRepoBeans());
	}

	// Tenant realms
	@Bean
	public TenantBeans<MongoRealm> realmBeans() {
		return new TenantBeans<MongoRealm>(MongoRealm.class) {
			@Override
			protected MongoRealm create(String tenantId, AppManifest appManifest) throws Exception {
				final String tenantEnv = env.getRequiredProperty("tenantEnv");
				final String mongoUriTemplate = env.getRequiredProperty("mongoUriTemplate");
				String mongoUri = UriTemplate.fromTemplate(mongoUriTemplate).expand(ImmutableMap.of("tenantId", tenantId, "tenantEnv", tenantEnv));
				final MongoRolePersonRepository rolePersonRepo = rolePersonRepoBeans().get(tenantId);
				final MongoRealm realm = new MongoRealm(tenantId, securityCatalog(), rolePersonRepo, mongoUri);
				return realm;
			}
		};
	};
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean(destroyMethod="destroy")
	public DefaultWebSecurityManager securityManager() {
		// TODO: since realms are dynamic, DefaultWebSecurityManager should be modified dynamically?
		log.info("Initializing DefaultWebSecurityManager with {} realms: {}", realmBeans().size(), realmBeans().keySet());
//		final Collection<Realm> joinedRealms = JoinedCollectionView.combine(
//				ImmutableList.<Realm>of(appRealm()), realmBeans().unmodifiableView().values());
		return new DefaultWebSecurityManager((Collection) realmBeans().unmodifiableView().values());
	}
	
	@Bean
	public ShiroFilterFactoryBean shiroFilter() throws VariableExpansionException, MalformedUriTemplateException {
		log.info("Initializing ShiroFilter with SecurityManager={} with {} realms: {}", 
				securityManager(), securityManager().getRealms().size(), securityManager().getRealms());
		final ShiroFilterFactoryBean factory = new ShiroFilterFactoryBean();
		factory.setSecurityManager(securityManager());
		return factory;
	}
	
}
