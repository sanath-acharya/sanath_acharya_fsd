package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Employee;
import com.example.demo.service.EmployeeDaoServiceImpl;
import com.example.demo.service.Employeservice;

@Controller
public class homecontroller {
	
	private Employeservice empserv;
	
	@Autowired
	public homecontroller(Employeservice empserv) {
		super();
		this.empserv = empserv;
	}

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/showform")
	public String showform(Model model) {
		model.addAttribute("employee",new Employee());
		return "show-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm( @ModelAttribute("employee") Employee employee)	{
	empserv.save(employee); 
		return "process-employee";
	}
}
