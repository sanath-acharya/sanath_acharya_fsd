package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Document
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Recommendation {
	private String name;
	
	private int id;
	

}
