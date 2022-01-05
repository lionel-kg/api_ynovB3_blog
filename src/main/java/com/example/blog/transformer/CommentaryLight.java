package com.example.blog.transformer;

import java.util.Date;

public class CommentaryLight {
		
	private Integer commentary_id;
	private String content;
	private Date date_pub;

	public Integer getCommentary_id() {
		return commentary_id;
	}
	public void setCommentary_id(Integer commentary_id) {
		this.commentary_id = commentary_id;
	}
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
	
}
