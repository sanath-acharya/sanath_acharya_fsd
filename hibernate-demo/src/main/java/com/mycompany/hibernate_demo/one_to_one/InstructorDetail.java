package com.mycompany.hibernate_demo.one_to_one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="instructor_detail")
public class InstructorDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="youtube_channel")
	private int id;
	
	@Column(name="youtube_channel")
	private String youtubechannel;
	
	@Column (name="hobby")
	private String hobby;
	
	public InstructorDetail() {
		
	}
	public InstructorDetail(String youtubechannel,String hobby) {
		this.hobby=hobby=hobby;
		this.youtubechannel=youtubechannel;
		
	}
	
	@Override
	public String toString() {
		return "Instructiondetail [id="+id+" youtubechannel"+ youtubechannel;
		
	}
	

}
