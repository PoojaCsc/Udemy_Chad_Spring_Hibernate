package com.udemy.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	private String[] fortunes = {"It's your lucky day","You can do it!","You are a genius!"};
	 
	@Override
	public String getFortune() {
		// generate a random fortune message
		
		
		Random rand = new Random();
		int rand_arr_index = rand.nextInt(fortunes.length);
		return fortunes[rand_arr_index];
	}

}
