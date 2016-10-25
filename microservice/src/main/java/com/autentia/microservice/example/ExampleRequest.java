package com.autentia.microservice.example;

public class ExampleRequest {

    private long id;
    private String message;


    public ExampleRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExampleRequest(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
