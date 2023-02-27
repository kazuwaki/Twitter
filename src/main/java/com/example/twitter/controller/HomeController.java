package com.example.twitter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.twitter.repository.entity.User;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/twitter")
public class HomeController {
	
	@GetMapping()
	public ModelAndView home(HttpSession session) {
		
		ModelAndView mav = new ModelAndView();
		User user = (User) session.getAttribute("loginUser");		
		mav.addObject("loginUser", user);
		mav.setViewName("/home");
		return mav;
	
		
	}
}
