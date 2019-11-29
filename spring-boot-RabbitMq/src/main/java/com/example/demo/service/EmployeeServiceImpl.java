package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeRepos;
import com.example.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepos empr;
	@Transactional
	public List<Employee> getallEmployeees() {
		// TODO Auto-generated method stub
		return (List<Employee>) empr.findAll();
	}
	@Override
	@Transactional
	public Employee savedata(Employee employee) {
		// TODO Auto-generated method stub
		return empr.save(employee);
	}

}
