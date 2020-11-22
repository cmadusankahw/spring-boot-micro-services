package com.example.chiran.microservices.training.microservicesTraining.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket parkingLotApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("ParkingLot-api").apiInfo(apiInfo()).select()
		.apis(RequestHandlerSelectors.basePackage(
				"com.example.chiran.microservices.training.microservicesTraining.controller"))
		.build();
				
	}
	
	
		private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Parking Lot API")
				.description("Parking Lot API reference for developers")
				.termsOfServiceUrl("http://cmadusankahw.github.io")
				.contact(new Contact("Parking Lot Application", "http://cmadusankahw.github.io", "cmadusankahw@gmail.com")).license("MIT License")
				.licenseUrl("cmadusankahw@gmail.com").version("1.0").build();
	}

}
