package com.badri.spring.rest.rest;

public class StudentNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	StudentNotFoundException() {
		
	}

	public StudentNotFoundException(String message, Throwable cause) {
	
		super(message, cause);
	
	}

	public StudentNotFoundException(String message) {
		
		super(message);

	}

	public StudentNotFoundException(Throwable cause) {
	
		super(cause);

	}
	

}
