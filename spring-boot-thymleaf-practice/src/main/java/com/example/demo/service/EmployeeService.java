package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	public List<Employee> getEmployee();
	public Employee createEmployee( Employee emp);
	public Employee findbyid(int id);
	public void deleteById(int tid);
	public List<Employee> searchbyany(String fname, String lname);
}
