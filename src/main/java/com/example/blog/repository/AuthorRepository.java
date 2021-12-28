package com.example.blog.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.blog.model.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> 
{
	public Author findByUsername(String username);
}
