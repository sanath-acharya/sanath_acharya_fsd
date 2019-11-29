package com.example.demo.controller;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IntegrationClient;

@RestController
public class mainController {

	@Autowired
	private IntegrationClient ic;
	
	@GetMapping("./getrecommed")
	public Map<String ,Collection> returningboth(){
		
		Map<String,Collection> mp=new HashMap<String,Collection>();
		
		mp.put("offer",ic.getOffers());
		mp.put("Recommendions",ic.getRecomendation());
		
		return mp;
	}
}
