package com.example.blog.transformer;

import java.util.Date;

import com.example.blog.model.Author;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class CommentaryFull extends CommentaryLight{
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Author author;
	
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	
}
