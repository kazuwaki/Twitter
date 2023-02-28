package com.example.twitter.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.twitter.controller.form.TweetsForm;
import com.example.twitter.repository.TweetRepository;
import com.example.twitter.repository.entity.Tweets;

@Service
public class TweetService {
	@Autowired
	TweetRepository tweetRepository;

	public void save(TweetsForm tweetsForm, int id) {
		// TODO 自動生成されたメソッド・スタブ
		Tweets tweets = setTweets(tweetsForm, id);
		tweetRepository.save(tweets);
	}

	private Tweets setTweets(TweetsForm tweetsForm, int id) {
		// TODO 自動生成されたメソッド・スタブ
		Tweets tweets = new Tweets();
		tweets.setId(tweetsForm.getId());
		tweets.setTitle(tweetsForm.getTitle());
		tweets.setBody(tweetsForm.getBody());
		tweets.setUserId(id);
		tweets.setCreated_at(new Date());
		tweets.setUpdated_at(new Date());
		return tweets;
	}

	public List<Tweets> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		List<Tweets> tweets = tweetRepository.findAll();
		return tweets;
	}

	

}
