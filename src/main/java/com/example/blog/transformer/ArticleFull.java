package com.example.blog.transformer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.blog.model.Author;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class ArticleFull extends ArticleLight{
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Author author;
	
	private List<CommentaryFull> commentary = new ArrayList<>();;
	
	public List<CommentaryFull> getCommentary() {
		return commentary;
	}
	public void setCommentary(List<CommentaryFull> list) {
		this.commentary = list;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	
}
