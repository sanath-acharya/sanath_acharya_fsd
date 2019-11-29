package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;
@Service
public class EmployeeServiceImpl  implements EmployeeService{
	@Autowired
	private	EmployeeDao Edao;
	@Override
	@Transactional
	public Employee CreateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return Edao.save(employee);
	}
	@Transactional
	@Override
	public List<Employee> listallemployee() {
		// TODO Auto-generated method stub
		return Edao.findAll();
	}
	@Override
	public void deleteEmploy(int id) {
		// TODO Auto-generated method stub
		 Edao.deleteById(id);
	}

	

}
