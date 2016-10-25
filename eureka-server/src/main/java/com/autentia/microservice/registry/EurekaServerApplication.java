package com.autentia.microservice.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	/**
	 * Run the application using Spring Boot and an embedded servlet engine.
	 */
	public static void main(String[] args) {

		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
