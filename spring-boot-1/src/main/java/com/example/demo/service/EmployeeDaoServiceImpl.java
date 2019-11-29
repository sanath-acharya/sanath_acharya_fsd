package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.Employee;
import com.example.demo.dao.EmployeeDao;

@Service
public class EmployeeDaoServiceImpl implements Employeservice{
	
	
	
	private EmployeeDao employeedao;
	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		
		return employeedao.save(employee);
		
	}

}
