package com.example.demo.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.Employee;

@RestController("/api")

public class EmployeeDashboardController {
	private RestTemplate restTemplate;
	@Autowired
	public EmployeeDashboardController(RestTemplate restTemplate) {
		super();
		this.restTemplate=restTemplate;
	}
	

	
	@RequestMapping("/dashboard/peers")
	public Collection<Employee> getAllPerrs(){
		String url="http://nilay-hp-elitebook-840-g2.d4t-in.ibmmobiledemo.com:8050/employee-search-service/api/employees";
		List<Employee> employee=restTemplate.getForObject(url,List.class);
	System.out.println("resopone is "+employee);
		
		return employee;
	}
	
}
