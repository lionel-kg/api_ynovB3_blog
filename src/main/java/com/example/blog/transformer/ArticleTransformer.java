package com.example.blog.transformer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.blog.model.Article;
import com.example.blog.model.Commentary;

@Component
public class ArticleTransformer {
	public ArticleFull transform(Article article) {
		ArticleFull articleFull = new ArticleFull();
		articleFull.setArticle_id(article.getArticle_id());
		articleFull.setContent(article.getContent());
		articleFull.setDate_pub(article.getDate_pub());
		articleFull.setCategory_id(article.getCategory_id());
		articleFull.setAuthor(article.getAuthor());
		
		for(Commentary commentary: article.getCommentary()) {
			CommentaryFull commentaryFull = new CommentaryFull();
			commentaryFull.setCommentary_id(commentary.getComment_id());
			commentaryFull.setContent(commentary.getContent());
			commentaryFull.setDate_pub(commentary.getDate_pub());
			commentaryFull.setAuthor(commentary.getAuthor());
			
			articleFull.getCommentary().add(commentaryFull);
		}
		
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
