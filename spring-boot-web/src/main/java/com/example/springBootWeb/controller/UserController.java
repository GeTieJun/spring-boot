package com.example.springBootWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBootWeb.model.User;
import com.example.springBootWeb.server.UserServer;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServer userServer;
	
	@RequestMapping(value="/insertDefaultUser")
	public String insertDefaultUser() {
		userServer.insertDefaultUser();
		return "insert default user success";
	}
	
	@RequestMapping(value="/selectUserById")
	public User selectUserById(@RequestParam Long userId) {
		return userServer.getUserById(userId);
	}
}
