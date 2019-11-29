package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.example.demo.service.Employeservice;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot1Application.class, args);
	}
	
//	@Component
//	class EmployeeCammandLineRunner implements CommandLineRunner{
//		@Autowired
//		private Employeservice empservice;
//		@Override
//		public void run(String... args) throws Exception {
//			// TODO Auto-generated method stub
//			
//			
//			Employee employee=null;
//			employee.setFirstname("john");
//			employee.setLastname("hello");
//			empservice.save(employee);
//			
//		}
//		
//	}
}
