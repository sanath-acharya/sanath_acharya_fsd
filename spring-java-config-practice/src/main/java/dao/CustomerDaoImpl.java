package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import lombok.Setter;
import model.Customer;

@Component("customerdao")

public class CustomerDaoImpl implements CustomerDAO {
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public void createCustomer(Customer customer) {
		jdbctemplate.update("insert into customer(first_name,last_name,email)values(?,?,?)",customer.getFirst_name(),customer.getLast_name(),customer.getEmail());
		
		
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return jdbctemplate.query("select first_name,last_name,email from customer1",new CustomerMapper());
		
	}
	

}
