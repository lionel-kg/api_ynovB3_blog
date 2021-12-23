package com.example.blog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.blog.model.Category;
import com.example.blog.repository.CategoryRepository;
import com.example.blog.transformer.CategoryFull;
import com.example.blog.transformer.CategoryTransformer;



@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category upsert(Category category) 
	{
		return categoryRepository.save(category);
	}
	
	public Optional<Category> getCategory(Integer id)
	{
		return categoryRepository.findById(id);
	}
	
	public List<CategoryFull> getCategories() {
		Iterable<Category> categories = categoryRepository.findAll();
		CategoryTransformer transformer = new CategoryTransformer();
		return transformer.transform(categories);
	}

	public void deleteCategory(Integer id)
	{
		categoryRepository.deleteById(id);
	}
}
