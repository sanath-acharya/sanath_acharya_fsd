package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.Data;

@Data
@Entity

public class Employee {

	@Id
	private int empid;
	
	private String empname;

	

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
}
