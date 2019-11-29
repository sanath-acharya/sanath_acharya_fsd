package com.example;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] data= {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	private Random my=new Random();
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index=my.nextInt(data.length);
		String theFortune=data[index];
		
		return theFortune;
	}

}
