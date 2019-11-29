package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	public Employee CreateEmployee(Employee employee);
	public List<Employee> listallemployee();
	public void deleteEmploy(int id);
}
