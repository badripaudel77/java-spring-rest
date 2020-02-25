package com.badri.spring.rest.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//telling it is the RestController, just to display the one line message to the client.

@RestController
@RequestMapping("/test")

public class DemoRestController {

	@GetMapping("/hello")
	public String messageFromRestController() {
		
		return " Hey Badri !!! from Rest Controller ."; 
	}
}
