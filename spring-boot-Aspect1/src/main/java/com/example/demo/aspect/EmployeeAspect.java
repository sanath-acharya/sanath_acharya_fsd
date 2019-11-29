package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class EmployeeAspect {
	
		@Before(value = "execution(* com.example.demo.service.EmployeeService.*(..)) and args(name,empid)")
		public void beforeAdvice(JoinPoint joinpoint,String name, String empid ) {
			System.out.println("Before method :"+ joinpoint.getSignature());
		}
		@After(value="execution(* com.example.demo.service.EmployeeService.*(..)) and args(name,empid)")
		public void afterAdvice(JoinPoint joinpoint ,String name,String empid) {
			System.out.println("After method:" + joinpoint.getSignature());
		}
}	
