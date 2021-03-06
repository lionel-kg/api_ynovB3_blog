package com.example.blog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blog.model.Article;
import com.example.blog.repository.ArticleRepository;
import com.example.blog.transformer.ArticleFull;
import com.example.blog.transformer.ArticleTransformer;

@Service
public class ArticleService {

	@Autowired
	private ArticleRepository articleRepository;
	
	@Autowired
	private ArticleTransformer articleTransformer;
	
	public Article upsert(Article article) 
	{
		return articleRepository.save(article);
	}
	
	public List<ArticleFull> getArticles() {
		Iterable<Article> articles = articleRepository.findAll();
		return articleTransformer.transform(articles);
	}
	public Optional<Article> getArticle(Integer id)
	{
		return articleRepository.findById(id);
	}
	
//	public Iterable<Article> getArticles()
//	{
//		return articleRepository.findAll();
//	}
	public void deleteArticle(Integer id)
	{
		articleRepository.deleteById(id);
	}
}
