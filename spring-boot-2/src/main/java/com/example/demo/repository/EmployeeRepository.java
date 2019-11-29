package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
import com.sun.xml.bind.v2.model.core.ID;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, ID> {

	

}
