package com.mycompany.hibernate_inheritance.subclass;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String[ ] arg) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Contract_Employee.class)
				.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Regular.class)
				.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Employee e=new Employee();
		e.setName("jhon");
		Regular r=new Regular();
		r.setBonus(5);
		r.setSalary(5000);
		
		Contract_Employee c=new Contract_Employee();
		c.setName("sachin");
		c.setPay_perhour(500);
		
		session.persist(c);
		session.persist(e);
		session.persist(r);
		
		t.commit();
		session.close();
		System.out.println("success");
		
	}
}
