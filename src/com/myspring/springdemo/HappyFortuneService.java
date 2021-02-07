package com.myspring.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		String[] fortunes = new String[] {"Good day!","Lucky Day!","Sunny day!","best day ever!"};
		Random random = new Random();
		int index = random.nextInt(fortunes.length);
		return fortunes[index];
	}

}
