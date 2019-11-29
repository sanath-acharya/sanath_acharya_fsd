package com.mycompany.spring_jdbc_di_demo.dao;

import java.sql.*;

import javax.sql.DataSource;

import com.mycompany.spring_jdbc_di_demo.model.Customer;

public class CustomerDAOImpl implements CustomerDao{
	private DataSource datasouce=null;
	
	
	
	
	@Override
	public void CreateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		 Connection connection=null;
		 Statement statement=null;
		 PreparedStatement pstatement=null;
		try {
			connection=datasouce.getConnection();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			pstatement=connection.prepareStatement("insert into customer1 (first_name,last_name,email)values(?,?,?)");
			pstatement.setString(1,customer.getFirstname() );
			pstatement.setString(2,customer.getLast_name());
			pstatement.setString(3,customer.getEmail());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
