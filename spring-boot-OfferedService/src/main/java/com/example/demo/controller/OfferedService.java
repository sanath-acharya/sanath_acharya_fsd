package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Offered;
import com.example.demo.service.offeredService;

@RestController
public class OfferedService {
	@Autowired
	private offeredService ofs;
	@GetMapping(name="/getoffer")
	public List<Offered> getoffe(){
		return ofs.getalloffers();
	}
	
	@PostMapping("/createoffer")
	public Offered createoff(@RequestBody Offered of) {
		return ofs.createoffers(of);
	}
}
