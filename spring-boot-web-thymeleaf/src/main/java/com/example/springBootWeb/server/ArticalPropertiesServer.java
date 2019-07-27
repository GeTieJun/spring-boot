package com.example.springBootWeb.server;

import org.springframework.stereotype.Service;

import com.example.springBootWeb.model.ArticalProperties;

@Service
public class ArticalPropertiesServer {

	public ArticalProperties getArticalPropertiesInfo() {
		return new ArticalProperties();
	}
}
