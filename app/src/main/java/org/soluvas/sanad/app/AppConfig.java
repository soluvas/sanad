package org.soluvas.sanad.app;

import org.soluvas.sanad.core.mvc.SanadMvcConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author ceefour
 *
 */
@Configuration
@Import(SanadMvcConfig.class)
public class AppConfig {

}
