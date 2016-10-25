package com.autentia.microservice.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@RequestMapping("microservice/")
public class ExampleController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Value("${config.key}")
	String key;


	@RequestMapping(method = RequestMethod.POST, value = "/example")
	public ExampleResponse ping(@RequestBody(required = true) ExampleRequest request) {

		logger.debug("--> ping received with key:" + key);
		logger.debug("--> id: {}", request.getId());
		logger.debug("--> content: {}", request.getMessage());

		return new ExampleResponse("Hello from Microservice - " + request.getId() + " - " + request.getMessage());
	}
}
