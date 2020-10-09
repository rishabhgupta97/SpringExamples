package com.SpringDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class BaseballCoach implements Coach {

	public BaseballCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("This method will run before postonstruct method");
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice daily";
	}
	
	@PostConstruct
	public void myInitMethod() {
		System.out.println("Inside init method");
		System.out.println("BeanInitialized");
	}
	
	@PreDestroy
	public void cleanUpMethod() {
		System.out.println("Do all cleanup stuff here");
	}
}
