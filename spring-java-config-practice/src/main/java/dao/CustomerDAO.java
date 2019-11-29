package dao;

import java.util.List;

import model.Customer;

public interface CustomerDAO {
	public void createCustomer(Customer customer);
	public List<Customer>getAllCustomer();
	

}
