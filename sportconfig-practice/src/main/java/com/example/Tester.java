package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
	public static void main(String arg[]) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SportConfig.class);

	Coach thecoach=context.getBean("tenniscoach",Coach.class);
System.out.println("starting..");
System.out.println(thecoach.getDailyfortune());


System.out.println("done...");
	
	}

}
