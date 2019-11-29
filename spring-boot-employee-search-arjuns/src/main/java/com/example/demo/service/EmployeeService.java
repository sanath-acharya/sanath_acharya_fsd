package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeed;
	@Transactional
	
	public List<Employee> findAll(){
		return employeed.findAll();
		
	}
	@Transactional
	public Employee Save(Employee theEmpl) {
		return employeed.save(theEmpl);
	}
}
