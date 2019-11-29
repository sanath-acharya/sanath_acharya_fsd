package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class,property="@id",scope=Employee.class)

@Entity
@Data
public class Employee {
	@Id
	
	private int empid;
	
	private String empname;
	


}
