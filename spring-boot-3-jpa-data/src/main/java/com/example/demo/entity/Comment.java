package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Comment {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Column(name="post_comment")
private StringBuffer comment;




}
