package com.example.factory;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.example.model.Users;

public class HibernateUtilFactory {

	private static Session session;
	public static Session getMySession() {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class)
				.buildSessionFactory();
		session=factory.openSession();
		
		
	return session;
	
	}
	
}
