package com.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
	FortuneService fs;
	public BaseballCoach() {
		System.out.println("inside BaseballCoach constructor");
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fs.getFortune();
	}

	@Autowired
	public void setFs(FortuneService fs) {
		System.out.println("Inside setter method");
		this.fs = fs;
	}
	

}
