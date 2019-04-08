package com.sud.firstJunit.junit;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateApplication {

	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
}
