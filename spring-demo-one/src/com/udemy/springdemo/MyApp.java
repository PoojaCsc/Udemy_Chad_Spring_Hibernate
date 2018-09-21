package com.udemy.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create the object
		Coach theCoach = new TrackCoach();  // plug in different coaches by changing this .
		
		//use the object
		System.out.println(theCoach.getDailyWorkout());

	}

}
