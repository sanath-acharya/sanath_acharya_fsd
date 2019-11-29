package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OfferdRepo;
import com.example.demo.model.Offered;
@Service
public class offeredImplservice implements offeredService{
	@Autowired
	private OfferdRepo orp;
	
	@Override
	@Transactional
	public List<Offered> getalloffers() {
		// TODO Auto-generated method stub
		return orp.findAll();
	}

	@Override
	@Transactional
	public Offered createoffers(Offered of) {
		// TODO Auto-generated method stub
		return orp.save(of);
	}

}
