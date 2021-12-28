package com.example.blog.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "articles")
public class Article {
	
	@Id
	private Integer article_id;
}
