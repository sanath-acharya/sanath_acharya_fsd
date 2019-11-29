package com.example.demo.service;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Offers;
import com.example.demo.model.Recommendation;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class IntegrationClient {
	@Autowired
	private RecommendationServiceClient Rs;
	@Autowired
	private OfferServiceClient Osc;
	
	@HystrixCommand(fallbackMethod="getOfferFallbackMethod")
	public Collection<Recommendation> getRecomendation(){
		
		return this.Rs.getRecommendations();
	}
	
	@HystrixCommand( fallbackMethod="getRecommendationFallback")
	public Collection<Offers> getOffers(){
		return this.Osc.getcurrentOffers();
		
	}
	public Collection<Offers> getOfferFallbackMethod(){
		return Arrays.asList();
	}
	public Collection<Recommendation>  getRecommendationFallback(){
		return Arrays.asList();
	}
}
