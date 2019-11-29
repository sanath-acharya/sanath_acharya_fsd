package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
@Repository
public interface  ConsumerRepo extends JpaRepository<Employee, Integer> {

}
