package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
@Repository
public interface EmployeeRepos extends CrudRepository<Employee, Integer>{

}
