package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.ThymeRepository;

@Service
public class tymeServiceImpl implements EmployeeService  {
@Autowired
private	ThymeRepository tyRepo;
	
	@Override
	@Transactional
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return tyRepo.findAll();
	}

	@Transactional
	@Override
	public Employee createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return tyRepo.save(emp);
	}
	
	@Transactional
	@Override
	public Employee findbyid(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> result= tyRepo.findById(id);
		
		Employee themployee=null;
		if(result.isPresent()) {
			themployee=result.get();
			
		}else {
			throw new RuntimeException(id+"did not find employee id " );
		}
		 
		return themployee;
		 
	}

	@Override
	@Transactional
	public void deleteById(int tid) {
		// TODO Auto-generated method stub
		tyRepo.deleteById(tid);
	}
@Transactional
	@Override
	public List<Employee> searchbyany(String fname, String lname) {
	System.out.println(fname+ " ee"+lname);
		// TODO Auto-generated method stub
		 return tyRepo.findByFirstnameContainsAndLastnameContainsAllIgnoreCase(fname, lname);
	
	}


}
