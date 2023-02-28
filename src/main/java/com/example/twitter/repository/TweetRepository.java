package com.example.twitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.twitter.repository.entity.Tweets;

@Repository
public interface TweetRepository extends JpaRepository<Tweets, Integer>{

}
