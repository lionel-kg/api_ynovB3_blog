package com.example.blog.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="categories")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "categoryId")
	private Integer categoryId;
	
	private String name;
	
	
	/*
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY, cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE
	})
	
	@JoinTable(
			name = "category_product",
			joinColumns = @JoinColumn(name = "category_Id"),
			inverseJoinColumns = @JoinColumn(name="product_id"))
		private List<Article> articles = new ArrayList<>();
	
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	*/
	public Integer getCategoryId() 
	{
		return categoryId;
	}
	
	public void setCategoryId(Integer categoryId) 
	{
		this.categoryId = categoryId;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	

	
}
