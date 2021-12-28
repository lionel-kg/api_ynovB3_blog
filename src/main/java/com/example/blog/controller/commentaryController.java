package com.example.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blog.service.CommentaryService;

@RestController
@RequestMapping("/blog-api")
public class commentaryController {
	
	@Autowired
	CommentaryService commentaryService;
	
	@DeleteMapping("/commentary/{id}")
	public void deleteCommentary(@PathVariable("id") Integer id) {
		commentaryService.deleteCommentary(id);
	}
}
