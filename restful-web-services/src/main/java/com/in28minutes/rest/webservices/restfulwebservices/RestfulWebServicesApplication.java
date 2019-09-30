package com.in28minutes.rest.webservices.restfulwebservices;

import com.in28minutes.rest.webservices.restfulwebservices.service.DefaultUserDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulWebServicesApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(RestfulWebServicesApplication.class);

	public static void main(String[] args) {
		LOGGER.info("hello");
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}

}
