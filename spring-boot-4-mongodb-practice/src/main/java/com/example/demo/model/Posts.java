package com.example.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Posts {
//	private ObjectId _id;
	private int userId;
	private String title;
//	private String body;
//	public String get_id() {
//		return _id.toHexString();
//	}
}
