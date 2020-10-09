package com.SpringDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TrackCoach implements Coach {

	public TrackCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("This Constructor will run before postConstruct method");
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hi run daily 5km";
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
