package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Posts;
import com.example.demo.repository.PostsRepository;
import com.example.demo.service.PostService;


@RestController	
@RequestMapping("/api")
public class PostController {
	private PostService pServie;
	@Autowired
//private	PostsRepository p;
	
	public PostController(PostService pServie) {
		super();
		this.pServie = pServie;
	}

	@RequestMapping("/posts")
	public List<Posts> getAllPosts(){
		return pServie.getAllPost();
		
	}
	@PostMapping("/p")
	public Posts Save(Posts p1) {
		return pServie.save(p1);
	}
}
