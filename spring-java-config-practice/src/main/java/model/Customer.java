package model;

import javax.persistence.Entity;

import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Customer {
	private String first_name;
	private String last_name;
	private String email;
	

}
