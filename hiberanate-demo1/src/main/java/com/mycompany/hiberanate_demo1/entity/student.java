package com.mycompany.hiberanate_demo1.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

import org.hibernate.annotations.GeneratorType;

@Data // getter setter argument 
@Entity
@Table(name = "student")
public class student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5573467667702441271L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) // identity auto incremented
	private int id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;
    	
}