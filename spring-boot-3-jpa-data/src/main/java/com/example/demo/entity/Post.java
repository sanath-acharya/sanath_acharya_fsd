package com.example.demo.entity;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
@Data
@Entity
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int postId;
	@Column(name="postname")
	private String postName;
	@Column(name="postdate")
	private Date postDate;
	
	@OneToMany(targetEntity = Comment.class)
	private List<Comment> comments; 
}
