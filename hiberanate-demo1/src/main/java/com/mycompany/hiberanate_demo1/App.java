package com.mycompany.hiberanate_demo1;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mycompany.hiberanate_demo1.entity.student;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try {
    	   
    	   SessionFactory factory=
    			   new Configuration().configure("hibernate.cfg.xml").
    			   addAnnotatedClass(student.class).
    			   buildSessionFactory();
    	   Session session=factory.openSession();
    	   
    	   student student=new student();
    	   student.setFirstName("John");
    	   student.setLastName("Doe");
    	   student.setEmail("john@luv2code.com");
    	   session.getTransaction().begin();
//    	   session.persist(student);
    	   
    	   session.save(student); // if already implemented 
    	   session.getTransaction().commit();
    	   System.out.println("sucess");
    	   session.close();
    	   
    	     
		
	} catch (Exception e) {
		// TODO: handle exception
	}
    }
}