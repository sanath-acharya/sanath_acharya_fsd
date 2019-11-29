package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Posts;

public interface PostService {
	public List<Posts> getAllPost();
	public Posts save(Posts p1);
}
