package com.example.twitter.repository.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tweets")
public class Tweets {
	
	@Id
	@Column
	private int id;
	
	@Column
	private String title;
	
	@Column
	private String body;
	
	@Column
	private int userId;
	
	@Column
	private Date created_at;
	
	@Column
	private Date updated_at;

}