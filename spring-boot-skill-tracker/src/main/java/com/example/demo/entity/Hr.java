package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Hr {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int User_id;
	@Column(name="username")
	private String username;
	@Column(name="firsname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="dob")
	private Date dob;
	@Column(name="securityquestion")
	private SequirityQuestion securityquestion;
	@Column(name="mobilenumber")
	private int mobilenumber;
}
