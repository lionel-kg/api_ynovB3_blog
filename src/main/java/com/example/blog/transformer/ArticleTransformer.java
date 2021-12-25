package com.example.blog.transformer;

import java.util.ArrayList;
import java.util.List;

import com.example.blog.model.Article;
import com.example.blog.model.Category;

public class ArticleTransformer {
	public ArticleFull transform(Article article) {
		ArticleFull articleFull = new ArticleFull();
		articleFull.setArticle_id(article.getArticle_id());
		articleFull.setContent(article.getContent());
		articleFull.setDate_pub(article.getDate_pub());
		articleFull.setCommentary(article.getCommentary());
		
		return articleFull;
	}
	
	public List<ArticleFull> transform(Iterable<Article> Articles) {
		List<ArticleFull> articleFull = new ArrayList<>();
		for(Article article : Articles) {
			articleFull.add(transform(article));
		}
		return articleFull;
	}
}