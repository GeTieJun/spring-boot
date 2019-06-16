package com.example.springBootWeb.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties (prefix="articalproperties")
public class ArticalProperties {
	
	//@Value("${ArticalProperties.title}")
	private String tital;
	
	//@Value("${ArticalProperties.description}")
	private String description;
	
	public String getTital() {
		return tital;
	}

	public void setTital(String tital) {
		this.tital = tital;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
