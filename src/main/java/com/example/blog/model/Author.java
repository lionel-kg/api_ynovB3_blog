package com.example.blog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer author_id;
	
	private String username;
	private String password;
	
	public Integer getAuthorId() {
		return author_id;
	}
	public void setAuthorId(Integer id) {
		this.author_id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
