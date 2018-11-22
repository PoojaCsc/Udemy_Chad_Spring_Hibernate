package com.udemy.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Do it!"+fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {                  // method name can be anything
		System.out.println("TrackCoach : inside method doMyStartupStuff");
	}
	
	// add a destroy method 
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach : inside method doMyCleanupStuff");
	}

}
