package org.soluvas.sanad.app;

import javax.inject.Inject;

import org.soluvas.sanad.core.mvc.SanadMvcConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {

	@Inject
	SanadMvcConfig sanadMvcConfig;
	
}
