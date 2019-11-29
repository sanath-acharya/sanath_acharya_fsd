package com.example.DAO1;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.example.factory.HibernateUtilFactory;
import com.example.model.Customer;

public class CustomerDAOImpl1  implements customerDAO1{
	private static Session session;

	public List<Customer> getALLCustomers() {
		// TODO Auto-generated method stub
	//	List<Customer> lst=null;
		System.out.println("retriving data");
		session=HibernateUtilFactory.getMySession();
		session.getTransaction().begin();
		Query query = null;
		try {
			query=session.createQuery("from customer3",Customer.class);

		} catch (Exception e) {
			System.out.println("retriving data"+e);
		}
				
		
		@SuppressWarnings("unchecked")
		List<Customer> lst=query.getResultList();
		session.getTransaction().commit();
		
		
		return lst;
	}

	public void createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		session=HibernateUtilFactory.getMySession();
		session.getTransaction().begin();
		
		session.save(customer);
		session.getTransaction().commit();
		
	}
}
