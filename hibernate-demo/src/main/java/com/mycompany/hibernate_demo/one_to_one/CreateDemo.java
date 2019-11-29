package com.mycompany.hibernate_demo.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {
	public static void main(String[] args) {
		SessionFactory factory= new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session session=factory.getCurrentSession()	;
		try {
			Instructor tempInstruct=new Instructor("madhu","patel","email");
			
			InstructorDetail temInstuctDetail=new InstructorDetail("http://www.youtube.com",
					"Guitar");
			tempInstruct.setInstructorDetail(temInstuctDetail);
			session.beginTransaction();
			System.out.println("saving instructor "+tempInstruct);
			session.save(tempInstruct);
			session.getTransaction().commit();
			System.out.println("done");
		}finally {
			factory.close();
		}
	}
}
