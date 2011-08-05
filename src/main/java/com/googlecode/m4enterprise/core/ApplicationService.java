package com.googlecode.m4enterprise.core;

public class ApplicationService {

    public String sayHello(String name) {
	if (name == null) {
	    throw new IllegalArgumentException("Name must not be null");
	}
	return "Hello: " + name;
    }
}
