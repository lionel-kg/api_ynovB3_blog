package com.example.blog.transformer;

import java.util.ArrayList;
import java.util.List;

import com.example.ynov.productapi.transformer.ProductLight;

public class CategoryFull extends CategoryLight{
	private Integer categoryId;
	private String name;
	private List<ArticleLight> articles = new ArrayList<>();
	
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ArticleLight> getArticles() {
		return articles;
	}
	public void setArticles(List<ArticleLight> articles) {
		this.articles = articles;
	}
	
}
