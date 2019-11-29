package com.example.demo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Recommendation;

@FeignClient("spring-boot-RecommendedService")
public interface RecommendationServiceClient {
	
	@RequestMapping(value="/getrecommendation", method=RequestMethod.GET)
	public List<Recommendation> getRecommendations();
	
}

