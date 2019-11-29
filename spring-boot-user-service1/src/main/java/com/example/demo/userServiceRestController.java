package com.example.demo;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userServiceRestController {
	@RequestMapping(value="/getPublicAddress",method=RequestMethod.GET)
	@ResponseBody
	@LoadBalanced
	public String getContact() {
		return "public Address";
		
	}
}
