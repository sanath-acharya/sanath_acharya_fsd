package com.mycompany.aaMvcLogin.dao;

import org.springframework.stereotype.Repository;

@Repository
public class customerDaoImpl implements customerDao {

	@Override
	public boolean validation1(String username,String password) {
		// TODO Auto-generated method stub
		if(username=="sanath"&&password=="sanath")
		return true;
		else return false;
	}

}
