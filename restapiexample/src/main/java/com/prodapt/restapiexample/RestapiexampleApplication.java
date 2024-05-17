package com.prodapt.restapiexample;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class RestapiexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiexampleApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI(@Value("${application-description}") String appDesciption,
			@Value("${application-version}") String appVersion) {

		return new OpenAPI().info(new Info().title("Person Directory API").version(appVersion)
				.description(appDesciption).termsOfService("http://swagger.io/terms/")
				.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}

	/**
	 * @Bean public RestTemplate getRestTemplate() { return new RestTemplate(); }
	 **/

	// OR
	@Bean
	public RestTemplate getRestTemplate(RestTemplateBuilder builder) {
		return builder.setConnectTimeout(Duration.ofMillis(3000))
				.setReadTimeout(Duration.ofMillis(3000)).build();
	}
	
	@Value("${URI}")
	private String baseURI;
	
	@Bean
	public RestClient restClient() {
		return RestClient.create(baseURI);
	}
}
