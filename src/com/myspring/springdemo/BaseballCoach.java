package com.myspring.springdemo;

public class BaseballCoach implements Coach{
	
	//Private Field for dependency
	private FortuneService fortuneService;
	
	//Constructor for dependency injection
	private BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "spend 30 min.";
	}

	@Override
	public String getDailyFortune() {
		//get a fortune
		return fortuneService.getFortune();
	}
}
