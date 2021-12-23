package com.example.blog.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.blog.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
