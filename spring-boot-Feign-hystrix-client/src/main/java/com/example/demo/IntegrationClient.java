package com.example.demo;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class IntegrationClient {

	@Autowired
	private OfffersServiceClient offsClient;
	
	@Autowired
	private RecommendationServiceClient rsc;
	
	@HystrixCommand(fallbackMethod="getOffersFallBack")
	public Collection<Offers> getOffers() {
		// TODO Auto-generated method stub
		return this.offsClient.getCurrentOffers();
	}
@HystrixCommand(fallbackMethod="getRecommendationFallback")
	public Collection<Product> getRecommendation() {
		// TODO Auto-generated method stub
		return this.rsc.getRecommendation();
	}
	

}
