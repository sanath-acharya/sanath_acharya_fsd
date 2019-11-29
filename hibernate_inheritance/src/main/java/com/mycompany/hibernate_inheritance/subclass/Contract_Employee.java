package com.mycompany.hibernate_inheritance.subclass;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name="contract_employee")
@PrimaryKeyJoinColumn(name="ID")
public class Contract_Employee extends Employee {
	@Column(name="pay_per_hour")
	private float pay_perhour;
	@Column(name="contract_duration")
	private String contract_duration;
	
	
}
