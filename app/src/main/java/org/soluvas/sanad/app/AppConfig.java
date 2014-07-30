package org.soluvas.sanad.app;

import org.soluvas.sanad.core.mvc.SanadMvcConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ceefour
 *
 */
@Configuration
@PropertySource("classpath:/META-INF/sanad.properties")
@Import(SanadMvcConfig.class)
public class AppConfig {

}
