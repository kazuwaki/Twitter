package com.example.twitter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.twitter.repository.entity.Tweets;
import com.example.twitter.repository.entity.User;
import com.example.twitter.service.TweetService;

import jakarta.servlet.http.HttpSession;


@Controller
@RequestMapping("/twitter")
public class HomeController {
	@Autowired
	TweetService tweetService;
	
	@GetMapping()
	public ModelAndView home(HttpSession session) {
		
		ModelAndView mav = new ModelAndView();
		User user = (User) session.getAttribute("loginUser");
		
		//tweetの全権取得
		List<Tweets> tweets = tweetService.findAll();
	
		mav.addObject("tweets", tweets);

		
		mav.addObject("loginUser", user);
		
		mav.setViewName("/home");
		return mav;
	}
}