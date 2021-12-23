package com.example.blog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blog.model.Article;
import com.example.blog.repository.ArticleRepository;

@Service
public class ArticleService {

	@Autowired
	private ArticleRepository articleRepository;
	
	public Article upsert(Article article) 
	{
		return articleRepository.save(article);
	}
	
	public Optional<Article> getArticle(Integer id)
	{
		return articleRepository.findById(id);
	}
	
	public Iterable<Article> getArticles()
	{
		return articleRepository.findAll();
	}
}
