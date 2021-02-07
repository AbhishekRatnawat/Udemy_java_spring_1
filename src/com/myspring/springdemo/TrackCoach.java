package com.myspring.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5K";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
