package com.example.blog.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="commentaries")
public class Commentary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="comment_id")
	private int comment_id;
	
	@ManyToOne(fetch = FetchType.LAZY,
    cascade =  CascadeType.ALL
    )
	@JoinColumn(name="author_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Author author;
	
	@Column(name="article_id")
	private Integer article_Id;
	
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	private Date date_pub = new Date();
	private String content;
	
	public int getComment_id() 
	{
		return comment_id;
	}
	
	public void setComment_id(int comment_id) 
	{
		this.comment_id = comment_id;
	}
	
	public Date getDate_pub() 
	{
		return date_pub;
	}
	
	public void setDate_pub(Date date_pub) 
	{
		this.date_pub = date_pub;
	}
	
	public String getContent() 
	{
		return content;
	}
	
	public void setContent(String content) 
	{
		this.content = content;
	}

	public Integer getArticle_Id() {
		return article_Id;
	}

	public void setArticle_Id(Integer article_Id) {
		this.article_Id = article_Id;
	}
	
}
