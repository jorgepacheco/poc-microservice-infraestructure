package com.autentia.microservice.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExampleApplication.class, args);
	}

}
