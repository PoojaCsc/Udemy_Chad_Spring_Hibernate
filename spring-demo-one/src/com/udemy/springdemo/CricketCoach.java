package com.udemy.springdemo;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : inside setter method setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : inside setter method setTeam");
		this.team = team;
	}


	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach : inside no -arg constructor");
	}

	// create setter method 
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("CricketCoach : inside setter method setFortuneService");
	}

	
	@Override
	public String getDailyWorkout() {
		return "Practise fast bowling for 15 minutes";
	}

	
	@Override
	public String getDailyFortune() {
				return fortuneService.getFortune();
	}

}
