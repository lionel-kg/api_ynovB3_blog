package com.example.blog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blog.model.Article;
import com.example.blog.service.ArticleService;
import com.example.blog.transformer.ArticleFull;
import com.example.blog.transformer.CategoryFull;

@RestController
@RequestMapping("/blog-api")
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@GetMapping("/articles")
	public List<ArticleFull> getCommentary() {
		return articleService.getCommentary();
	}
	
	@GetMapping("/article/{id}")
	public ResponseEntity<Article> getArticle(@PathVariable("id") Integer id) {
		Optional<Article> c = articleService.getArticle(id);
		if (c.isPresent()) {
			return new ResponseEntity<Article>(c.get(), HttpStatus.OK);
		}
		return new ResponseEntity<Article>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/auth/article/add")
	public Article addArticle(@RequestBody Article article){
		return articleService.upsert(article);		
	}
	
	@DeleteMapping("/auth/article/{id}")
	public void deleteArticle(@PathVariable("id") Integer id) {
		articleService.deleteArticle(id);
	}
	
}
