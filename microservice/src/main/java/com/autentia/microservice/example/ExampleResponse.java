package com.autentia.microservice.example;

public class ExampleResponse {

    private String responseMessage;

    public ExampleResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExampleResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }
}
