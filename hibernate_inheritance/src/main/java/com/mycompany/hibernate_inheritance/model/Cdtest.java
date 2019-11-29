package com.mycompany.hibernate_inheritance.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Cdtest {
	public static void main(String[] ar) {
	try {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(InternationalCd.class).addAnnotatedClass(SpecialEditionCd.class).addAnnotatedClass(Cd.class).buildSessionFactory();
		
		Session session=factory.openSession();
		Cd cd=new Cd("grace undr");
		SpecialEditionCd sp=new SpecialEditionCd("hello","what");
		InternationalCd icd=new InternationalCd("sanath","h");
		
		session.getTransaction().begin();
		session.save(cd);
		session.save(sp);
		session.save(icd);
		session.getTransaction().commit();
		System.out.println("ok..");
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
}
