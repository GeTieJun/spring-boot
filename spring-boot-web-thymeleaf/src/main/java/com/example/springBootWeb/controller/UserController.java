package com.example.springBootWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springBootWeb.model.User;
import com.example.springBootWeb.server.UserServer;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServer userServer;
	
	@RequestMapping("")
	public String index(Model model) {
		List<User> allUser = userServer.getAllUser();
		model.addAttribute("userList", allUser);
		return "user";
	}
	
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
