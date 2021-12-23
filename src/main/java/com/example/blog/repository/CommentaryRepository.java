package com.example.blog.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.blog.model.Commentary;

public interface CommentaryRepository extends CrudRepository<Commentary, Integer> {

}
