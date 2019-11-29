package com.example.demo.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;


@Service
public class RabbitMqSender {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	@Value("${foo.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${foo.rabbitmq.queue}")
	private String queue;
	
	@Value("${foo.rabbitmq.routingkey}")
	private String Routingkey;
	
	public void send(Employee emp) {
		amqpTemplate.convertAndSend(exchange,Routingkey,emp);
		System.out.println("sending message  ="+emp);
		
		
		
	}
	
}
