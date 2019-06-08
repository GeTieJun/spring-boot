package com.spring.springStart.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {
	
	Logger logger = LoggerFactory.getLogger(StartController.class);
	
	@RequestMapping("/hello")
	public String springStart() {
		return "hello spring boot....";
	}
	
}
