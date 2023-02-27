package com.example.twitter.service;

import java.util.Date;

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

	public void insert(UserForm userForm) {
		// TODO 自動生成されたメソッド・スタブ
		User user = setUserForm(userForm);
		userRepository.save(user);
	}

	private User setUserForm(UserForm userForm) {
		// TODO 自動生成されたメソッド・スタブ
		User user = new User();
		user.setId(userForm.getId());
		user.setName(userForm.getName());
		user.setEmail(userForm.getEmail());
		user.setPassword(userForm.getPassword());
		user.setCreated_at(new Date());
		user.setUpdated_at(new Date());
		return user;
	}
	
	

}
