package com.example.demo.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Employee;
@Repository
public class EmployeeImplDao  implements EmployeeDao{
/*
 * 

Since version 2.0, JPA provides easy access to the APIs of the underlying implementations. The EntityManager and the EntityManagerFactory provide an unwrap method which returns the corresponding classes of the JPA implementation.

In the case of Hibernate, these are the Session and the SessionFactory.
 **/
 
	private EntityManager entitymanager;
	
	@Autowired
	public EmployeeImplDao(EntityManager entityManager) {
		this.entitymanager=entityManager;
	}
	@Override
	public Employee save(Employee emloyee) {
		// TODO Auto-generated method stub
		
		Session currentsession=entitymanager.unwrap(Session.class);
		currentsession.save(emloyee);
		return (Employee) currentsession;
	}
	

}
