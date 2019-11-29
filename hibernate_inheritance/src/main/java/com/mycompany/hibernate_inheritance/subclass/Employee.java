package com.mycompany.hibernate_inheritance.subclass;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name="Employee_direction")
@Data

public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id1")
	private int id;
	
	@Column(name="name")
	private String name;
	
	public Employee() {
		
	}
	
}

