package com.example.twitter.repository.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {

	
	private int id;
	
	private String name;
	
	private String password;
	
	private String email;
	
	private Date created_at;
	
	private Date updated_at;
}