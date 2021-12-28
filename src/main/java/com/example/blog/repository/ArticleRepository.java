package com.example.blog.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.blog.model.Article;

public interface ArticleRepository extends CrudRepository<Article, Integer> {

}
