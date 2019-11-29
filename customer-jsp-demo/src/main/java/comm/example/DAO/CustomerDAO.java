package src.main.java.comm.example.DAO;

import java.util.List;

import comm.example.model.Customer;

public interface CustomerDAO {
	public List<Customer> getAllCustomers();
	public void createCustomer(Customer customer);
}
