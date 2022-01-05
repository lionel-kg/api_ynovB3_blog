package com.example.blog.model;

import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.blog.transformer.CommentaryFull;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="articles")
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "article_id")
	private Integer article_id;
	private String content;
	private Date date_pub = new Date();
	
	@ManyToOne(fetch = FetchType.LAZY,
	        cascade =  CascadeType.MERGE
	)
	@JoinColumn(name="authorId")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Author author;
	
	@Column(name="category_id")
	private Integer category_id;

	public void setCommentary(List<Commentary> commentary) {
		this.commentary = commentary;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER , orphanRemoval = true)
	@JoinColumn(name="article_id")
	private List<Commentary> commentary = new ArrayList<>();   
	 
	public List<Commentary> getCommentary() 
	{
	      return commentary;
	}
	
	public Integer getArticle_id() 
	{
		return article_id;
	}
	
	public void setArticle_id(Integer article_id) 
	{
		this.article_id = article_id;
	}
	
	public String getContent() 
	{
		return content;
	}
	
	public void setContent(String content) 
	{
		this.content = content;
	}
	
	public Date getDate_pub() 
	{
		return date_pub;
	}
	
	public void setDate_pub(Date date_pub) 
	{
		this.date_pub = date_pub;
	}

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_Id(Integer category_id) {
		this.category_id = category_id;
	}
}
