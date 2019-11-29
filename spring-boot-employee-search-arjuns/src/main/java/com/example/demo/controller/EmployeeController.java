package com.example.demo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
//@RefreshScope
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeService employeS;

@RequestMapping("/employee")
public Collection<Employee> getAllemploee() {
	 return employeS.findAll();
}
	
	@PostMapping("/employee")
	public Employee Save(@RequestBody Employee emp) {
		return employeS.Save(emp);
	}
	
}
