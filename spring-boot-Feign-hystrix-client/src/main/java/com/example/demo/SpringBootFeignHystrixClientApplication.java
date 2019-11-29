package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@org.springframework.cloud.openfeign.EnableFeignClients
@EnableCircuitBreaker

public class SpringBootFeignHystrixClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFeignHystrixClientApplication.class, args);
	}

}
