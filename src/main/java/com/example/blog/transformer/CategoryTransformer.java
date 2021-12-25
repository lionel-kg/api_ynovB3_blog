package com.example.blog.transformer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.blog.model.Article;
import com.example.blog.model.Category;


@Component
public class CategoryTransformer {
	public CategoryFull transform(Category category) {
		CategoryFull categoryFull = new CategoryFull();
		categoryFull.setCategoryId(category.getCategoryId());
		categoryFull.setName(category.getName());
		
		for(Article article : category.getArticles()) {
			ArticleLight articleLight = new ArticleLight();
			articleLight.setArticle_id(article.getArticle_id());
			articleLight.setContent(article.getContent());
			articleLight.setDate_pub(article.getDate_pub());
//			articleLight.setDescription(article.getDescription());
//			articleLight.setCost(article.getCost());
			
			categoryFull.getArticles().add(articleLight);
		}		
		return categoryFull;
	}
	
	public List<CategoryFull> transform(Iterable<Category> categories) {
		List<CategoryFull> categoriesFull = new ArrayList<>();
		for(Category category : categories) {
			categoriesFull.add(transform(category));
		}
		return categoriesFull;
	}
}
