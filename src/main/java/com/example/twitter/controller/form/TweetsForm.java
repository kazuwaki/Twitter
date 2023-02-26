package com.example.twitter.controller.form;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TweetsForm {
	
	private int id;
	
	private String title;
	
	private String body;
	
	private int userId;
	
	private Date created_at;
	
	private Date updated_at;
}
