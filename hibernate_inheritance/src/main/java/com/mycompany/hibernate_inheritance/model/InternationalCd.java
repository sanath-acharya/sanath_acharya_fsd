package com.mycompany.hibernate_inheritance.model;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data


@Table
public class InternationalCd extends Cd{
	
	
	private String region;
	public InternationalCd(){
		
	}
	public InternationalCd(String a,String b ) {
		super(a);
		this.region=b;
		
	}
}
