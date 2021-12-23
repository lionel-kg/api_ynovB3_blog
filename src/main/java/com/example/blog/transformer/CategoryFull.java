package com.example.blog.transformer;

import java.util.ArrayList;
import java.util.List;

public class CategoryFull extends CategoryLight{
	private Integer categoryId;
	private String name;
	
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
	
}
