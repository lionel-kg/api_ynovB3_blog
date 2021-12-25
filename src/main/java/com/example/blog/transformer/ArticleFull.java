package com.example.blog.transformer;

import java.util.Date;
import java.util.List;

import com.example.blog.model.Commentary;

public class ArticleFull extends ArticleLight{
	private String content;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate_pub() {
		return date_pub;
	}
	public void setDate_pub(Date date_pub) {
		this.date_pub = date_pub;
	}
	public List<Commentary> getCommentary() {
		return commentary;
	}
	public void setCommentary(List<Commentary> commentary) {
		this.commentary = commentary;
	}
	private Date date_pub;
	private List<Commentary> commentary;
	
	
}
