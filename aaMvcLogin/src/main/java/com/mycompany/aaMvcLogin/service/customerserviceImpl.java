package com.mycompany.aaMvcLogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.aaMvcLogin.dao.customerDao;

@Service
public class customerserviceImpl implements customerService {

	@Autowired
	private customerDao customerdao;
	@Override
	public boolean getValidation(String username,String password) {
		// TODO Auto-generated method stub
		
		
		return customerdao.validation1( username, password);

	}

}
