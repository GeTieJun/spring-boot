package com.example.springBootWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBootWeb.model.ArticalProperties;
import com.example.springBootWeb.server.ArticalPropertiesServer;
@RestController
public class ArticalPropertiesController {
	
	@Autowired
	private ArticalPropertiesServer articalPropertiesServer;
	
	@Value("${ArticalProperties.title}")
	private String tital;
		
	@Value("${ArticalProperties.description}")
	private String description;
	
	@RequestMapping(value = "/getArticalPropertiesInfo")
	public ArticalProperties getArticalPropertiesInfo() {
		ArticalProperties articalProperties = articalPropertiesServer.getArticalPropertiesInfo();
		return articalProperties;
	}
	
	@RequestMapping(value = "/defaultVlaue")
	public String getArticalDefaultVlaue() {
		return "title is: " + tital + " description is : " + description;
	}
}
