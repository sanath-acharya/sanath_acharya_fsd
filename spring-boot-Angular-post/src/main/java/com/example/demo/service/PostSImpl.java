package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PostDao;
import com.example.demo.model.posts;

@Service
public class PostSImpl implements PostService {
	
	@Autowired
	private PostDao pd;
	@Override
	public List<posts> getallPosts() {
		// TODO Auto-generated method stub
		return pd.findAll();
	}

	@Override
	public posts createPost(posts post) {
		// TODO Auto-generated method stub
		return pd.save(post);
	}

}
