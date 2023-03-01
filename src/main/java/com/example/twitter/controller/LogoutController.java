package com.example.twitter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/twitter")
public class LogoutController {
	
	@PostMapping("/user/logout")
	public ModelAndView logoutUser(HttpSession session) {
		session.invalidate();
		return new ModelAndView("redirect:/twitter/login");
	}

}
