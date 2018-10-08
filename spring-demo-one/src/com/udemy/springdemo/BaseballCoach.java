package com.udemy.springdemo;

public class BaseballCoach implements Coach {
	
	// Define a private field for the dependency.
	private FortuneService fortuneService;
	
	// Define a  constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService ;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mintues on batting practise";
	}


	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		
		return fortuneService.getFortune();
	}

}
