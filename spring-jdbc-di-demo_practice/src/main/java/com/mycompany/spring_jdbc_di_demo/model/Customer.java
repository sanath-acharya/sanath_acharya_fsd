package com.mycompany.spring_jdbc_di_demo.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Customer {
	private String firstname;
	private String  last_name;
	private String email;
}
