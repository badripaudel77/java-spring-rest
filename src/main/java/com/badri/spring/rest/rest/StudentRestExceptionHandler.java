package com.badri.spring.rest.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//for handling global exception for this whole app
@ControllerAdvice //annotation used for this purpose this is the best practice for large apps
public class StudentRestExceptionHandler {


	// handle the thrown exception using annotation
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException e) {

		StudentErrorResponse error = new StudentErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	//handle generic exception like /api/students/fjfjfjfjfjfj(some random text), because 
	//above case only handles int value
	
	//catch all
	
			@ExceptionHandler
			public ResponseEntity<StudentErrorResponse> handleException(Exception e) {

				StudentErrorResponse error = new StudentErrorResponse();
				
				error.setStatus(HttpStatus.BAD_REQUEST.value());
				error.setMessage(e.getMessage());
				error.setTimeStamp(System.currentTimeMillis());

				
				return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
			}
			
		
		
}
