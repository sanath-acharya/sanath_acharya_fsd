package com.mycompany.aaMvcLogin.controller;

import java.util.ArrayList;
public class TodoController {
	
	private int id;
	private String name;
	private ArrayList<String> cars ;
	public void hello() {
		cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
	}
}
