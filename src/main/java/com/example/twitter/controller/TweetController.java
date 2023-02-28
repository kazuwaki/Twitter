package com.example.twitter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.twitter.controller.form.TweetsForm;
import com.example.twitter.repository.entity.User;
import com.example.twitter.service.TweetService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/twitter")
public class TweetController {
	
	@Autowired
	TweetService tweetService;
	
	@GetMapping("/createTweet")
	public ModelAndView creatTweet() {
		
		ModelAndView mav = new ModelAndView();
		
		TweetsForm tweetsForm = new TweetsForm();
		
		mav.setViewName("create_tweet");
		mav.addObject("tweetsForm", tweetsForm);
		
		return mav;
		
	}
	
	@PostMapping("/tweet/add")
	public ModelAndView tweetAdd(@ModelAttribute("tweetsForm") TweetsForm tweetsForm, HttpSession session) {
		
		User user = (User) session.getAttribute("loginUser");
		int id = user.getId();
		
		tweetService.save(tweetsForm, id);
		
		return new ModelAndView("redirect:/twitter");
		
	}

}
