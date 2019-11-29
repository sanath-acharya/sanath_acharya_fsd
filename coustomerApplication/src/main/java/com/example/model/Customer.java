package com.example.model;

import javax.persistence.*;

import lombok.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="customer3")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customer_id")
	private int id;
	
	@Column(name="first_name")
	private String fname;
	@Column(name="last_name")
	private String lname;
	@Column(name = "address")
	private String address;
	@Column(name = "customer_type")
	private String customerType;
	
	@Version
	private int version;
	
	public Customer(String fname,String lname,String address,String customerType) {
	this.fname=fname;
	this.lname=lname;
	this.address=address;
	this.customerType=customerType;
	
	}
	
}
