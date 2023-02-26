package com.example.twitter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.twitter.controller.form.UserForm;
import com.example.twitter.repository.UserRepository;
import com.example.twitter.repository.entity.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public User select(UserForm userForm) {
		
		String password = userForm.getPassword();
		String email = userForm.getEmail();
		User user = userRepository.findByEmailAndPassword(email, password);
		
		return user;
	}
	
	

}
