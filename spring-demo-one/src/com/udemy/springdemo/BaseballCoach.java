package com.udemy.springdemo;

public class BaseballCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mintues on batting practise";
	}

}