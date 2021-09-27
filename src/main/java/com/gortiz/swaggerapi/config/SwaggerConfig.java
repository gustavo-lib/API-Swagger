package com.gortiz.swaggerapi.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.Contact;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
	@Bean
    public Docket api() { 

        return new Docket(DocumentationType.SWAGGER_2)  
        		.select()
    			//	.apis(RequestHandlerSelectors.any())
    				.apis(RequestHandlerSelectors.basePackage("com.gortiz.swaggerapi"))
    				.paths(PathSelectors.any())
    				.build()
    				.apiInfo(getApiInfo());                                  
    }

	
    private ApiInfo getApiInfo() {
	    ApiInfo apiInfo = new ApiInfo(
                "Spring  Swagger Example API for Gustavo Ortiz",
                "Spring Boot Swagger Example API ",
                "1.0",
                "",
                new Contact("gortiz", "https://",
                        "@gmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html"
        );

        return apiInfo;
    }
}
