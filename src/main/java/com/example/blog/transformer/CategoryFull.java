package com.example.blog.transformer;

import java.util.ArrayList;
import java.util.List;


public class CategoryFull extends CategoryLight{

	private List<ArticleFull> articles = new ArrayList<>();
	
	public List<ArticleFull> getArticles() {
		return articles;
	}
	public void setArticles(List<ArticleFull> articles) {
		this.articles = articles;
	}
	
}
