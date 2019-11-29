package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Recommendation;
import com.example.demo.service.RecommendationService;

@RestController
public class RecommendedController {
	@Autowired
	private RecommendationService res;
	@RequestMapping("/getrecommendation")
	public List<Recommendation> getRecommendations(){
		return res.findAll();
	}
	
}
