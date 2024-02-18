package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.User;

public interface UserService {
 String addUser(User user);
 
//checks email is already present in database or not
	boolean checkEmail(String email);
	//validates user's credentials
	boolean validate(String email, String password);
	//get user's role by providing email
		String getUserRole(String email);
		//get user by providing email
		User getUser(String email);
		
		//save updated user to database
		String updateUser(User user);
		
	
}
