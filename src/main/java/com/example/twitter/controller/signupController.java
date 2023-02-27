package com.example.twitter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.twitter.controller.form.UserForm;
import com.example.twitter.repository.entity.User;
import com.example.twitter.service.UserService;

@Controller
@RequestMapping("/twitter")
public class signupController {
	@Autowired 
	UserService userService;
	
	@GetMapping("/signup")
	public ModelAndView signup( ) {
		
		ModelAndView mav = new ModelAndView();
		UserForm userForm = new UserForm();
		
		mav.addObject("userForm", userForm);
		mav.setViewName("signup");
		return mav;
		
	}
	
	@PostMapping("/signupUser")
	public ModelAndView signupUser(@ModelAttribute("userForm") UserForm userForm) {
		
		User user = new User();
		userService.insert(userForm);
		return new ModelAndView("redirect:/twitter/login");
		
	}

}
