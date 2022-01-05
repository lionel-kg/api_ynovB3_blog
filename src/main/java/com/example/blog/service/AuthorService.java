package com.example.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blog.model.Author;
import com.example.blog.repository.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	public Author getUserByUsername(String name) {
		return authorRepository.findByUsername(name);
	}
}

