package com.mycompany.spring_jdbc_di_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring_jdbc_di_demo.dao.CustomerDAOImpl;
import com.mycompany.spring_jdbc_di_demo.dao.CustomerDao;
import com.mycompany.spring_jdbc_di_demo.model.Customer;



/**
 * Hello world!
 *
 */
public class Tester 
{
    public static void main( String[] args )
    {
    	try {

    	       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	       CustomerDao customerDAO=context.getBean("CustomerDAOImpl",CustomerDAOImpl.class);
    	     
    	       
    	       customerDAO.CreateCustomer(new Customer("Sourav", "Ganguly", "sourav@luv2code.com"));
    			System.out.println("ok!");
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    }
}
