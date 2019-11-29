package com.mycompany.hibernate_demo.one_to_one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="instructor")
@Data

public class Instructor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firsstname;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="email")
	private String email;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="instructor_detail_id")
	private InstructorDetail instructorDetail;
	
	public Instructor() {
		
	}
	public Instructor(String firstName, String lastName, String email) {
		this.firsstname = firstName;
		this.last_name = lastName;
		this.email = email;
	}
	
	public String toString() {
		return "Instruction[id=" +id+" "+firsstname;
		
	}
	
	
}
