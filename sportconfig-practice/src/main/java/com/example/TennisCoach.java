package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("ranFortuneService")
	private FortuneService fortuneservice;
	
	public TennisCoach() {
		System.out.println(">> tennis coach: inside deffault constructor");
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice your backhacd volley";
	}

	@Override
	public String getDailyfortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}

}
