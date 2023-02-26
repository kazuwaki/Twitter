package com.example.twitter.controller.form;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserForm {
	
	private int id;
	
	private String name;
	
	private String password;
	
	private String email;
	
	private Date created_at;
	
	private Date updated_at;
	
}
