package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserServiceImplementation implements UserService{
	@Autowired
	UserRepository repo;
	
	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub
		repo.save(user);
		return "student added successfully!";

	}

	@Override
	public boolean checkEmail(String email) {
		// TODO Auto-generated method stub
		return repo.existsByEmail(email);
	}

	@Override
	public boolean validate(String email, String password) {
		// TODO Auto-generated method stub
		if(repo.existsByEmail(email)) {
			User u=repo.getByEmail(email);
			String dbPassword=u.getPassword();
			if(password.equals(dbPassword)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

	@Override
	public String getUserRole(String email) {
		// TODO Auto-generated method stub
		User u=repo.getByEmail(email);
		return u.getRole();
	}

	@Override
	public User getUser(String email) {
		// TODO Auto-generated method stub
		return repo.getByEmail(email);
	}

	@Override
	public String updateUser(User user) {
		// TODO Auto-generated method stub
		repo.save(user);
		return "student updated successfully!";
	}

}
