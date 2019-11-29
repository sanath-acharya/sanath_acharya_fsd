package com.example.demo.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class RabbitMqConfiq {
	@Value("${foo.rabbitmq.queue}")
	String queuename;
	@Value("${foo.rabbitmq.routingkey}")
	String routingkey;
	@Value("${foo.rabbitmq.exchange}")
	String exchange;
	
	@Bean
	Queue queue() {
		return new Queue(queuename,false);
		
	}
	
	@Bean
	DirectExchange exhange() {
		return new DirectExchange(exchange);
	}
	
	@Bean
	public MessageConverter jsonMessageConverter() {
		return new Jackson2JsonMessageConverter();
	}
	@Bean
	Binding binding(Queue queue, DirectExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with(routingkey);
		
	}
	
	public AmqpTemplate rabbitTemplate(ConnectionFactory connectinofactoy)
	{
		final RabbitTemplate rabittemp=new RabbitTemplate(connectinofactoy);
				
		rabittemp.setMessageConverter(jsonMessageConverter());
		return rabittemp;
	}
}
