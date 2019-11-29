package com.mycompany.hibernate_inheritance.model;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data


@Table
public class SpecialEditionCd extends Cd{
	
	private String newfeature;
	
	public SpecialEditionCd(String title,String name)
	{
		super(title);
		this.newfeature=name;
	}
	
}
