package com.example.springBootWeb.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties (prefix="articalproperties")
public class ArticalProperties {
	
	//@Value("${ArticalProperties.title}")
	private String title;
	
	//@Value("${ArticalProperties.description}")
	private String description;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
