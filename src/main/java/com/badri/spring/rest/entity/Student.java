package com.badri.spring.rest.entity;

import org.springframework.web.bind.annotation.GetMapping;

//POJO class 
public class Student {

	private String firstName;
	private String lastName;
	
	public Student() {
		
	}

	public Student(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
