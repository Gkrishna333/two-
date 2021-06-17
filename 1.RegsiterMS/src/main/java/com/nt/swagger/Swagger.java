package com.nt.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger {


		
		@Bean
		public Docket createDocket() {
			return new Docket(DocumentationType.SWAGGER_2)
					.select()
					.apis(RequestHandlerSelectors.basePackage("com.nt.rest"))
					.paths(PathSelectors.regex("/api.*")) // . = one char , * = many
					.build().apiInfo(new ApiInfo("REGISTER_MS#", null, null, null, null, null, null));
					
		}
	
}
