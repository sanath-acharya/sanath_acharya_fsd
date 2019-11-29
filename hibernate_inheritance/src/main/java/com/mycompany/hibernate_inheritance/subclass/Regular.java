package com.mycompany.hibernate_inheritance.subclass;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="Regular_Employee")
@PrimaryKeyJoinColumn(name="Id")
@Data
@EqualsAndHashCode(callSuper=false)	

public class Regular extends Employee  {

	@Column(name="salary")
	private float salary;
	@Column(name="bonus")
	private int bonus;
	
}
