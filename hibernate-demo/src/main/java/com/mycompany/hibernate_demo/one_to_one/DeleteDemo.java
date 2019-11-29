package com.mycompany.hibernate_demo.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class DeleteDemo {

		public static void main(String[] ar) {
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
					.addAnnotatedClass(InstructorDetail.class)
					.buildSessionFactory();
			Session session=factory.getCurrentSession();
			try {
				session.beginTransaction();
				int theId=1;
				Instructor temp=session.get(Instructor.class, theId);
				
				System.out.println("found instructor "+temp);
				
				if(temp!=null) {
					System.out.println("deleting " +temp);
					session.delete(temp);
					
				}
				session.getTransaction().commit();
				System.out.println("done");
				
				
			}finally {
				factory.close();
			}
			
		}
}
