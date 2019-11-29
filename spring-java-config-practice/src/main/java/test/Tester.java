package test;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.CustomerDAO;
import dao.CustomerDaoImpl;
import model.Customer;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println("starting ...");
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Application-context.xml");
	
		CustomerDAO customerdao=context.getBean("customerdao",CustomerDaoImpl.class);
		
		
		List<Customer> list=customerdao.getAllCustomer();
		
		
		Iterator<Customer> i=list.iterator();
		while(i.hasNext()) {
			Customer c=i.next();
			
			System.out.println(c.getEmail()+"  "+c.getFirst_name());
		}
		System.out.println("done");
	} 

}
