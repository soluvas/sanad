package org.soluvas.sanad.app;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.UnauthorizedException;
import org.apache.wicket.Page;
import org.apache.wicket.RestartResponseAtInterceptPageException;
import org.apache.wicket.Session;
import org.apache.wicket.core.request.handler.PageProvider;
import org.apache.wicket.core.request.handler.RenderPageRequestHandler;
import org.apache.wicket.core.request.handler.RenderPageRequestHandler.RedirectPolicy;
import org.apache.wicket.protocol.http.servlet.ServletWebRequest;
import org.apache.wicket.protocol.http.servlet.ServletWebResponse;
import org.apache.wicket.request.IRequestHandler;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Response;
import org.apache.wicket.request.Url;
import org.apache.wicket.request.cycle.AbstractRequestCycleListener;
import org.apache.wicket.request.cycle.RequestCycle;
import org.apache.wicket.request.http.WebRequest;
import org.apache.wicket.request.http.WebResponse;
import org.apache.wicket.request.resource.ResourceReference;
import org.apache.wicket.request.resource.ResourceReferenceRegistry;
import org.apache.wicket.request.resource.SharedResourceReference;
import org.apache.wicket.request.resource.UrlResourceReference;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.commons.tenant.TenantMode;
import org.soluvas.sanad.web.GuestLayoutPage;
import org.soluvas.sanad.web.HomePage;
import org.soluvas.sanad.web.SanadApplication;
import org.soluvas.security.NotLoggedInException;
import org.soluvas.web.bootstrap.sound.Howler;
import org.soluvas.web.login.AccessDeniedPage;
import org.soluvas.web.login.DedicatedLoginPage;
import org.soluvas.web.site.AtmosphereApplication;
import org.soluvas.web.site.SlowRequestFilter;
import org.soluvas.web.site.SoluvasWebSession;
import org.springframework.core.env.Environment;
import org.wicketstuff.annotation.mount.MountPath;
import org.wicketstuff.annotation.scan.AnnotatedMountScanner;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.base.Throwables;
import com.google.common.collect.Iterables;

import de.agilecoders.wicket.core.Bootstrap;
import de.agilecoders.wicket.core.markup.html.RenderJavaScriptToFooterHeaderResponseDecorator;
import de.agilecoders.wicket.core.settings.BootstrapSettings;
import de.agilecoders.wicket.core.settings.IBootstrapSettings;
import de.agilecoders.wicket.core.settings.ThemeProvider;
import de.agilecoders.wicket.less.BootstrapLess;
import de.agilecoders.wicket.less.LessResourceReference;
import de.agilecoders.wicket.themes.markup.html.bootswatch.BootswatchTheme;
import de.agilecoders.wicket.themes.markup.html.bootswatch.BootswatchThemeProvider;
import de.agilecoders.wicket.webjars.WicketWebjars;
import de.agilecoders.wicket.webjars.settings.WebjarsSettings;

/**
 * @author ceefour
 *
 */
public class SanadWebApplication extends AtmosphereApplication
	implements SanadApplication {
	
	/**
	 * @author ceefour
	 * @deprecated https://issues.apache.org/jira/browse/WICKET-5661. Use {@link RestartResponseAtInterceptPageException} directly or via utility class instead.
	 */
	@Deprecated
	private final class NotLoggedInRequestCycleListener extends AbstractRequestCycleListener {
		@Override
		public IRequestHandler onException(RequestCycle cycle, Exception ex) {
			// Since our actual exception is wrapped, we need to find based on the chain
			final List<Throwable> chain = Throwables.getCausalChain(ex);
			final NotLoggedInException notLoggedInException = Iterables.getFirst(
					Iterables.filter(chain, NotLoggedInException.class), null);
			if (notLoggedInException != null) {
				final Url url = cycle.getRequest().getClientUrl();
				log.debug("Got exception " + notLoggedInException.getClass().getName() + " on " + url, ex);
				final SoluvasWebSession session = (SoluvasWebSession) Session.get();
				session.setOriginalUrl(url);
				session.info("Please log in");
				session.dirty();
				return new RenderPageRequestHandler(new PageProvider(DedicatedLoginPage.class));
			} else {
				return super.onException(cycle, ex);
			}
		}
	}
	
	private final class UnauthorizedRequestCycleListener extends AbstractRequestCycleListener {
		@Override
		public IRequestHandler onException(RequestCycle cycle, Exception ex) {
			// Since our actual exception is wrapped, we need to find based on the chain
			final List<Throwable> chain = Throwables.getCausalChain(ex);
			final UnauthorizedException unauthorizedException = Iterables.getFirst(
					Iterables.filter(chain, UnauthorizedException.class), null);
			if (unauthorizedException != null) {
				log.debug("Got exception " + unauthorizedException.getClass().getName() + " on " + cycle.getRequest().getUrl(), ex);
				final Session session = Session.get();
				session.error("Access denied: " + unauthorizedException.getMessage());
				session.dirty();
				return new RenderPageRequestHandler(new PageProvider(AccessDeniedPage.class),
						RedirectPolicy.NEVER_REDIRECT);
			} else {
				return super.onException(cycle, ex);
			}
		}
	}

	private static final Logger log = LoggerFactory
			.getLogger(SanadWebApplication.class);
	
	@Inject
	private Environment env;
	
	/**
	 * @see https://github.com/l0rdn1kk0n/wicket-bootstrap/blob/bootstrap-parent-0.9.1/bootstrap-samples/src/main/java/de/agilecoders/wicket/samples/WicketApplication.java 
	 */
	@Override
	protected void init() {
		super.init();
		
		getDebugSettings().setAjaxDebugModeEnabled(false);
		
		configureWebjars();
		configureBootstrap();
		
		optimizeForWebPerformance();
		
		getComponentInstantiationListeners().add(
				new SpringComponentInjector(this));
		Howler.install(this);
		getRequestCycleListeners().add(new NotLoggedInRequestCycleListener());
		getRequestCycleListeners().add(new UnauthorizedRequestCycleListener());
		getRequestCycleSettings().addResponseFilter(new SlowRequestFilter());
		
		mountResources();
		mountPages();
	}
	
	/**
	 * See https://github.com/l0rdn1kk0n/wicket-webjars
	 */
	private void configureWebjars() {
        // install 2 default collector instances 
        // (FileAssetPathCollector(WEBJARS_PATH_PREFIX), JarAssetPathCollector)
        // and a webjars resource finder.
        final WebjarsSettings settings = new WebjarsSettings();

        // register vfs collector to use webjars on jboss (you don't need to add maven dependency)
//        Set<AssetPathCollector> collectors = Sets.newHashSet(settings.assetPathCollectors());
//        collectors.add(new VfsJarAssetPathCollector());
//        settings.assetPathCollectors(collectors.toArray(new AssetPathCollector[collectors.size()]));

        WicketWebjars.install(this, settings);
	}

	// TODO: LESS support. Shouldn't be needed later:
	// https://issues.apache.org/jira/browse/WICKET-5635 / https://github.com/l0rdn1kk0n/wicket-bootstrap/issues/409 
	
	@Override
    protected ResourceReferenceRegistry newResourceReferenceRegistry() {
        return new ResourceReferenceRegistry(new LessRRFactory());
    }

    private static class LessRRFactory extends ResourceReferenceRegistry.DefaultResourceReferenceFactory {

        @Override
        public ResourceReference create(ResourceReference.Key key) {
            if (key.getName().endsWith(".less")) {
                return new LessResourceReference(key);
            } else {
                return super.create(key);
            }
        }
    }
    
    // --- End LESS support
    
    /**
     * configures wicket-bootstrap and installs the settings.
     */
    private void configureBootstrap() {
        final ThemeProvider themeProvider = new BootswatchThemeProvider(BootswatchTheme.Cosmo);

        final BootstrapSettings settings = new BootstrapSettings();
        settings
        	// in your Page:
        	// <wicket:container wicket:id="footer-container"/>
        	// add(new HeaderResponseContainer("footer-container", "footer-container"));
        	// in app.optimizeForWebPerformance(): setHeaderResponseDecorator(new RenderJavaScriptToFooterHeaderResponseDecorator());
        	.setJsResourceFilterName("footer-container")
        	.useCdnResources(this.usesDeploymentConfig())
        	.setThemeProvider(themeProvider);
        Bootstrap.install(this, settings);

        BootstrapLess.install(this);
    }
    
    public void optimizeForWebPerformance() {
//        if (usesDeploymentConfig()) {
//            getResourceSettings().setCachingStrategy(new FilenameWithVersionResourceCachingStrategy(
//                    "-v-",
//                    new CachingResourceVersion(new Adler32ResourceVersion())
//            ));
//
//            getResourceSettings().setJavaScriptCompressor(new GoogleClosureJavaScriptCompressor(CompilationLevel.SIMPLE_OPTIMIZATIONS));
//            getResourceSettings().setCssCompressor(new YuiCssCompressor());
//
//            getFrameworkSettings().setSerializer(new DeflatedJavaSerializer(getApplicationKey()));
//        } else {
//            getResourceSettings().setCachingStrategy(new NoOpResourceCachingStrategy());
//        }

		// Use CDN jQuery if we're in production
    	IBootstrapSettings bootstrapSettings = Bootstrap.getSettings(this);
		if (bootstrapSettings.useCdnResources()) {
			getJavaScriptLibrarySettings().setJQueryReference(new UrlResourceReference(
				Url.parse("//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js")));
		}
    	
        setHeaderResponseDecorator(new RenderJavaScriptToFooterHeaderResponseDecorator());
//        getRequestCycleSettings().setRenderStrategy(IRequestCycleSettings.RenderStrategy.ONE_PASS_RENDER);
    }

    /**
     * This is different than {@link AnnotatedMountScanner} because it works with
     * {@link TenantMode#MULTI_PATH}.
     * @param page
     */
	private void mountPage(Class<? extends Page> page) {
		final MountPath mountPath = Preconditions.checkNotNull(page.getAnnotation(MountPath.class),
				"Page class %s does not have @MountPath annotation", page.getName());
		switch (getTenantMode()) {
		case MULTI_PATH:
			mountPage("t/${tenantId}/${tenantEnv}/" + mountPath.value(), page);
			break;
		case MULTI_HOST:
			if ("".equals(mountPath.value())) {
				log.info("Not mounting empty mount point for page {} in {} tenant mode",
						page.getName(), getTenantMode());
			} else {
				mountPage(mountPath.value(), page);
			}
			break;
		default:
			throw new IllegalArgumentException("Unsupported tenantMode: " + getTenantMode());
		}
	}

	private TenantMode getTenantMode() {
		final TenantMode tenantMode = env.getRequiredProperty("tenantMode", TenantMode.class);
		return tenantMode;
	}
	
	private void mountResources() {
		mountResource("favicon.ico", new SharedResourceReference(GuestLayoutPage.class, "cloud-96.ico"));
	}
	
	private void mountPages() {
		//Security
		mountPage(DedicatedLoginPage.class);
		
		final AnnotatedMountScanner scanner = new AnnotatedMountScanner();
		scanner.scanPackage("org.soluvas.sanad.web").mount(this);
		
		//Dashboard Management
//		mountPage(DashboardPage.class);
		
		//Person Management
//		mountPage(AccountSettingsPage.class);
//		mountPage(PersonListPage.class);
//		mountPage(PersonAddPage.class);
//		mountPage(PersonEditPage.class);
//		mountPage(PersonSigninPage.class);
//		
//		//Frequency
//		mountPage(FrequencyPage.class);
	}

	/**
	 * Gets the default style from {@link Mall}. Can be null.
	 * @return
	 */
//	@Nullable
//	protected String getDefaultStyle() {
//		return BootswatchTheme.Cosmo.name().toLowerCase();
//	}

	@Override
	public SoluvasWebSession newSession(Request request, Response response) {
		final SoluvasWebSession session = new SoluvasWebSession(request);
//		final String defaultStyle = getDefaultStyle();
//		if (defaultStyle != null) {
//			session.setStyle(defaultStyle);
//		}
//		session.setUserId("hendy");
		return session;
	}
	
	/**
	 * Hack so that nginx proxy won't get ;jsessionid= which breaks proxy_redirect.
	 * See https://cwiki.apache.org/WICKET/seo-search-engine-optimization.html#SEO-SearchEngineOptimization-Wicket1.5
	 */
	@Override
	protected WebResponse newWebResponse(final WebRequest webRequest, final HttpServletResponse httpServletResponse) { 
	    return new ServletWebResponse((ServletWebRequest)webRequest, httpServletResponse) {

	      @Override
	      public String encodeURL(CharSequence url) {
	          return isRobot(webRequest) ? url.toString() : super.encodeURL(url);
	      }
		  
	      @Override
	      public String encodeRedirectURL(CharSequence url) {
	          return isRobot(webRequest) ? url.toString() : super.encodeRedirectURL(url);
	      }

	      private boolean isRobot(WebRequest request) {
//	          final String agent = webRequest.getHeader("User-Agent");
//	          return agent.toLowerCase().contains("nginx");
	    	  final String forwardedFor = webRequest.getHeader("X-Forwarded-For");
	    	  return !Strings.isNullOrEmpty(forwardedFor);
	      } 
	  };
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
	
	@Override
	public Class<? extends Page> getHomePage() {
		return HomePage.class;
	}

}
