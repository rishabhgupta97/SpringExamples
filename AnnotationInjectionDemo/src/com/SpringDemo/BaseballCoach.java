package com.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
	FortuneService fs;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice daily";
	}
	
	@Autowired
	public BaseballCoach(FortuneService fs) {
		super();
		this.fs = fs;
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fs.getFortune();
	}

}
