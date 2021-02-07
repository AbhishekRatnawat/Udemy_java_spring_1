package com.myspring.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: setEmailAddress");
		this.emailAddress = emailAddress;
	}
	
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("CricketCoach: setTeam");
		this.team = team;
	}

	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter method");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Work hard on the off drive!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Gentleman's game" + fortuneService.getFortune();
	}

}
