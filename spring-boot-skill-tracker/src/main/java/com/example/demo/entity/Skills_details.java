package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Skills_details {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="skillId")
	private int skillid;
	@Column(name="SkillDomain")
	private String skilldomain;
	@Column(name="skillname")
	private String skillname;
	
	
}
