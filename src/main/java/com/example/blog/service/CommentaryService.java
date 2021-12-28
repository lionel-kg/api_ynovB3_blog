package com.example.blog.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.blog.model.Commentary;
import com.example.blog.repository.CommentaryRepository;

@Service
public class CommentaryService {
	
	@Autowired
	private CommentaryRepository commentaryRepository;
	
	public Commentary upsert(Commentary commentary) 
	{
		return commentaryRepository.save(commentary);
	}
	
	public Optional<Commentary> getCommentary(Integer id)
	{
		return commentaryRepository.findById(id);
	}
	
	public Iterable<Commentary> getCommentaries()
	{
		return commentaryRepository.findAll();
	}
	
	public void deleteCommentary(Integer id)
	{
		commentaryRepository.deleteById(id);
	}
}
