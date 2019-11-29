package com.example;

import org.springframework.stereotype.Component;

@Component("happyfortuneService")
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "today is happy day";
	}

}
