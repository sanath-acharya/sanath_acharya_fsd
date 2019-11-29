package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.posts;

@Service
public interface PostService {
	public List<posts> getallPosts();
	public posts createPost( posts post);
}
