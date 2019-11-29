package com.example.demo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Offers;

@FeignClient("spring-boot-OfferedService")
public interface OfferServiceClient {
//	@RequestMapping(value="/getcurrentoffers",method=RequestMethod.GET)
	@GetMapping(name="/getoffer")
	public List<Offers> getcurrentOffers();
	
}
