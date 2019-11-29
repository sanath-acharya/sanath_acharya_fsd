package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.posts;
import com.example.demo.service.PostService;







@RestController
@RequestMapping("/api")
public class PostController {
	@Autowired
	private PostService ps;	
//	@Autowired
//	PostController(PostService ps){
//		this.ps=ps;
//	}
	@GetMapping("/posts")
	public List<posts> getallpost() {
		return ps.getallPosts();
	} 
	
	
	@PostMapping("/posts")
	public posts createPost(@RequestBody posts post) {
		return ps.createPost(post);
	}
}
