package org.soluvas.sanad.core.mvc;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.inject.Inject;
import java.util.UUID;

/**
 * Swagger-powered API docs available at
 * <a href="http://sanad.sanad.amidea.dev:8980/swagger/index.html">http://sanad.sanad.amidea.dev:8980/swagger/index.html</a>
 *
 * @author ceefour
 */
@Configuration
@ComponentScan(basePackages = "com.mangofactory.swagger")
public class SwaggerConfig {

    public static final String SWAGGER_GROUP = "default";
    @Inject
    private SpringSwaggerConfig springSwaggerConfig;

    @Bean
    public SwaggerSpringMvcPlugin swaggerSpringMvcPlugin() {
        return new SwaggerSpringMvcPlugin(springSwaggerConfig)
                .apiInfo(apiInfo())
                .ignoredParameterTypes(UUID.class, DateTime.class, LocalDate.class);
    }

    private ApiInfo apiInfo() {
        return new ApiInfo("Sanad RESTful API",
                "Authenticity/Truth Maintenance System",
                "http://www.hendyirawan.com/", "ceefour666@gmail.com",
                "Eclipse Public License 1.0", "http://www.spdx.org/licenses/EPL-1.0");
    }

}
