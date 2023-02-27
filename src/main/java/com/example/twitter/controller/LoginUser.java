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

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/twitter")
public class LoginUser {
	@Autowired
	UserService userService;
	
	/*
	 *  ログイン画面表示処理
	 */
	@GetMapping("/login")
	public ModelAndView login() {
		
		ModelAndView mav = new ModelAndView();
		
		UserForm userForm = new UserForm();
		mav.addObject("userForm", userForm);
		
		mav.setViewName("/login");
		
		return mav;
	}
	
	/*
	 * ログイン処理
	 */
	@PostMapping("/loginUser")
	public ModelAndView loginUser(@ModelAttribute("userForm") UserForm userForm, HttpSession session) {
		
		
		User user = userService.select(userForm);
		if(user == null) {
			return new ModelAndView("/login");
		}
		session.setAttribute("loginUser", user);
		return new ModelAndView("redirect:/twitter");
	}

}
