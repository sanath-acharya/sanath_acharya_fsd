package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.RabbitMqSender;
@RestController
@RequestMapping("/rabbit")
public class RabbitController {
	
@Autowired
	private EmployeeService emps;
	@Autowired
	private RabbitMqSender rab;

//
//	@GetMapping("/getEmployee")
//	public List<Employee> getEmployees(){
//		return emps.getallEmployeees();
//	}

@GetMapping("/producer")
public Employee CreateEmployee(@RequestParam("empname") String empname,@RequestParam("empid") int empid) {
	Employee employee=new Employee();
	employee.setEmpid(empid);
	employee.setEmpname(empname);
	rab.send(employee);
	return emps.savedata(employee);
}
}
