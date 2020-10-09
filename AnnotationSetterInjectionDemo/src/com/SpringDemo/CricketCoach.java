package com.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	@Autowired
	FortuneService fs;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do bowling and bating daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fs.getFortune();
	}

}
