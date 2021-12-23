package com.example.blog.model;

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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="articles")
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "article_id")
	private int article_id;
	private String content;
	private Date date_pub;
	
	/*@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "author")
	 private Author author;*/
	
	 @JsonIgnore
	 @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER , orphanRemoval = true)
	 @JoinColumn(name="article_id")
	 private List<Commentary> commentary;   
	 
	 public List<Commentary> getCommentary() 
	 {
	       return commentary;
	 }
	
	public int getArticle_id() 
	{
		return article_id;
	}
	
	public void setArticle_id(int article_id) 
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
}
