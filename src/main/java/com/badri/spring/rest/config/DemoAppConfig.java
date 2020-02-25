package com.badri.spring.rest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//configuration class
@Configuration
@EnableWebMvc
@ComponentScan("com.badri.spring.rest")
public class DemoAppConfig {
	

}
