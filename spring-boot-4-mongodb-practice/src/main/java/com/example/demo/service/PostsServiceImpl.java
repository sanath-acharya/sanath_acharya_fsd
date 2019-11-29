package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Posts;
import com.example.demo.repository.PostsRepository;
@Service
public class PostsServiceImpl implements PostService{
	private PostsRepository prepository;
	@Autowired
	public PostsServiceImpl(PostsRepository prepository) {
		super();
		this.prepository = prepository;
	}
	
	@Override
	public List<Posts> getAllPost() {
		// TODO Auto-generated method stub
		
		
		return prepository.findAll();
	}

	@Override
	public Posts save(Posts p1) {
		// TODO Auto-generated method stub
		return prepository.save(p1);
	}

}
