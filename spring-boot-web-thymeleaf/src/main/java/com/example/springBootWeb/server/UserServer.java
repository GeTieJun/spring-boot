package com.example.springBootWeb.server;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.springBootWeb.dao.UserMapper;
import com.example.springBootWeb.model.User;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServer {

	@Resource
	private UserMapper userMapper;
	
	public void insertDefaultUser() {
		User user = new User();
		user.setUsername("xiaoming" + (int)(Math.random() * 100));
		user.setAge(new Integer((int)(Math.random() * 100)));
		user.setAddress("北京市朝阳区5号");
		userMapper.insert(user);
	}
	
	public User getUserById(Long userId) {
		User user = userMapper.selectByPrimaryKey(userId);
		return user;
	}

	public List<User> getAllUser(){
		return userMapper.selectAll();
	}

}
