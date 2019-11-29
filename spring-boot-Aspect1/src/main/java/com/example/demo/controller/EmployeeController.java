package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empservie;
	
	@RequestMapping(value="/add/employee",method=RequestMethod.GET)
	public Employee createemp(@RequestParam("name") String name,@RequestParam("empid") String empid) {
		
		return empservie.createEmployee(name,empid);
	}
	
//	@RequestMapping(value="/remove/employee",method=RequestMethod.Get)
//	public String removeEmpl(@RequestMapping("empid") String empid) {
//		return empservice.dele
//	}
}
