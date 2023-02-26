package com.example.twitter.repository.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Tweets {
	
	private int id;
	
	private String title;
	
	private String body;
	
	private int userId;
	
	private Date created_at;
	
	private Date updated_at;

}
