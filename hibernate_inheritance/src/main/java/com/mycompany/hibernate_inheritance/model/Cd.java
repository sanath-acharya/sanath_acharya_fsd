package com.mycompany.hibernate_inheritance.model;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data




public class Cd {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String title;
	
	public Cd()
	{
		
	}
	public Cd(String titil) {
		this.title=titil;
		
	}
	
}
