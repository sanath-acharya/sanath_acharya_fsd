package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class EmployeeService {

	public Employee createEmployee(String name,String empid) {
		Employee emp=new Employee();
		emp.setEmpId(empid);
		emp.setName(name);
		return emp;
	}
	
}
