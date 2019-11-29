package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.Customer;

public class CustomerMapper implements RowMapper<Customer>{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Customer customer =new Customer();
		
		customer.setEmail(rs.getString("email"));
		customer.setFirst_name(rs.getString("first_name"));
		customer.setLast_name(rs.getString("email"));
		
		
		return customer;
		
	}
	
	
	
}
