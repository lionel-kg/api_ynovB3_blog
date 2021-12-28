package com.example.blog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blog.model.Category;
import com.example.blog.service.CategoryService;
import com.example.blog.transformer.CategoryFull;

@RestController
@RequestMapping("/blog-api")
public class CategoryController {
	

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/categories")
	public List<CategoryFull> getCategories() {
		return categoryService.getCategories();
	}

	@GetMapping("/category/{id}")
	public ResponseEntity<Category> getCategory(@PathVariable("id") Integer id) {
		Optional<Category> c = categoryService.getCategory(id);
		if (c.isPresent()) {
			return new ResponseEntity<Category>(c.get(), HttpStatus.OK);
		}
		return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
	}

	@PostMapping("/category/add")
	public Category addCategory(@RequestBody Category category) {
		return categoryService.upsert(category);
	}
	
	@PutMapping("/category")
	public Category editCategory(@RequestBody Category category) {
		return categoryService.upsert(category);
	}
	
	@DeleteMapping("/category/{id}")
	public void deleteCategory(@PathVariable("id") Integer id) {
		categoryService.deleteCategory(id);
	}
}
