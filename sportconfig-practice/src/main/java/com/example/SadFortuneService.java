package com.example;

import org.springframework.stereotype.Component;

@Component("sadfortuneService")
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "today is a lucky day";
	}

}
