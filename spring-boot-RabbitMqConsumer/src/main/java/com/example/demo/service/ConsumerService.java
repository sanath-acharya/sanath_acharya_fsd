package com.example.demo.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repos.ConsumerRepo;


@Service

public class ConsumerService {
	@Autowired
private	ConsumerRepo repo;
	
	private static final String  Queue="foo.queue";
	
	@RabbitListener(queues=Queue)
	public void Receivermessage(Employee empl) {
		
	repo.save(empl);
		System.out.println("this is employee "+empl);
	}

}
