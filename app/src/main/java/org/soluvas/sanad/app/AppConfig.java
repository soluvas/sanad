package org.soluvas.sanad.app;

import java.io.File;

import javax.inject.Inject;
import javax.inject.Named;

import org.soluvas.commons.AggregatingSupplier;
import org.soluvas.commons.AppManifest;
import org.soluvas.commons.SupplierXmiClasspathScanner;
import org.soluvas.commons.config.CommonsWebConfig;
import org.soluvas.commons.config.MultiTenantConfig;
import org.soluvas.commons.config.MultiTenantWebConfig;
import org.soluvas.commons.config.TenantSelector;
import org.soluvas.commons.tenant.TenantBeans;
import org.soluvas.commons.tenant.TenantUtils;
import org.soluvas.sanad.core.mvc.SanadMvcConfig;
import org.soluvas.web.site.PageMetaProvider;
import org.soluvas.web.site.PermalinkConfig;
import org.soluvas.web.site.RulesPageMetaProvider;
import org.soluvas.web.site.SimpleSite;
import org.soluvas.web.site.Site;
import org.soluvas.web.site.pagemeta.PageMetaCatalog;
import org.soluvas.web.site.pagemeta.PagemetaFactory;
import org.soluvas.web.site.pagemeta.PagemetaPackage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.eventbus.EventBus;

/**
 * @author ceefour
 *
 */
@Configuration
@PropertySource("classpath:/META-INF/sanad.properties")
@Import({SanadSecurityConfig.class, MultiTenantWebConfig.class, SanadMvcConfig.class})
public class AppConfig {

	@Configuration
	@Import(PermalinkConfig.class)
	public static class SiteConfig {
		
		@Inject
		private Environment env;
		@Inject @Named(CommonsWebConfig.APP_EVENT_BUS)
		private EventBus appEventBus;
		@Inject
		private MultiTenantConfig tenantConfig;
		@Inject
		private TenantSelector tenantSelector;

		@Bean @Deprecated
		public Site site() {
			return new SimpleSite();
		}
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		@Bean
		public TenantBeans<AggregatingSupplier<PageMetaCatalog>> aggregatingPageMetaCatalogSupplierBeans() {
			return (TenantBeans) new TenantBeans<AggregatingSupplier>(AggregatingSupplier.class) {
				@Override
				protected AggregatingSupplier<PageMetaCatalog> create(String tenantId, AppManifest appManifest)
						throws Exception {
					final File dataDir = TenantUtils.selectBean(tenantId, tenantConfig.dataDirMap(), File.class);
					final AggregatingSupplier<PageMetaCatalog> aggregator = new AggregatingSupplier<>(PagemetaFactory.eINSTANCE,
							PagemetaPackage.Literals.PAGE_META_CATALOG, ImmutableList.<Supplier<PageMetaCatalog>>of());
					new SupplierXmiClasspathScanner<>(PagemetaPackage.eINSTANCE, PageMetaCatalog.class, aggregator, SiteConfig.class.getClassLoader(), dataDir);
					return aggregator;
				}
			};
		}
		
//		@Bean @Scope("prototype")
//		public AggregatingSupplier<PageMetaCatalog> aggregatingPageMetaCatalogSupplier() {
//			return aggregatingPageMetaCatalogSupplierBeans().getCurrent();
//		}
		
		@Bean
		public TenantBeans<PageMetaProvider> pageMetaProviderBeans() {
			return new TenantBeans<PageMetaProvider>(PageMetaProvider.class) {
				@Override
				protected PageMetaProvider create(String tenantId, AppManifest appManifest)
						throws Exception {
					final AggregatingSupplier<PageMetaCatalog> aggregatingPageMetaCatalogSupplier = aggregatingPageMetaCatalogSupplierBeans().get(tenantId);
					return new RulesPageMetaProvider(aggregatingPageMetaCatalogSupplier.get());
				}
			};
		}
		
		@Bean @Scope("prototype")
		public PageMetaProvider pageMetaProvider() {
			return pageMetaProviderBeans().getCurrent();
		}
		
	}
		
	@Configuration
	@ImportResource("classpath:/META-INF/shell/shell-context.xml")
	@ComponentScan({"org.soluvas.commons.shell", "org.soluvas.data.person.shell"})
	public static class ShellConfig {
	}
	
	@Bean
	public SanadWebApplication webApp() {
		return new SanadWebApplication();
	}
	
}
