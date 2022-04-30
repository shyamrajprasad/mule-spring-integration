package com.shyam.service;

import com.shyam.model.User;

public class UserServiceImpl implements UserService {
	
	private User user;

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Hello from " + user.getFirstName();
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
