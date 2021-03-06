package org.soluvas.sanad.core.mvc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soluvas.json.JsonUtils;
import org.soluvas.sanad.core.SanadConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.mangofactory.swagger.plugin.EnableSwagger;

/**
 * @author ceefour
 *
 */
@Configuration
@Import(SanadConfig.class)
@ComponentScan("org.soluvas.sanad.core.mvc")
@EnableTransactionManagement
@EnableWebMvc
@EnableSwagger
public class SanadMvcConfig extends WebMvcConfigurerAdapter {
	
	private static final Logger log = LoggerFactory
			.getLogger(SanadMvcConfig.class);

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/swagger/**")
//			.addResourceLocations("classpath:/swagger/");
	}
	
	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	@Override
	public void configureMessageConverters(
			List<HttpMessageConverter<?>> converters) {
		MappingJackson2HttpMessageConverter jackson2 = new MappingJackson2HttpMessageConverter();
		jackson2.setObjectMapper(JsonUtils.mapper);
		converters.add(jackson2);
		log.info("Spring MVC Message Converters: {}", converters);
	}
	
}
