package com.SpringDemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hi run daily 5km";
	}
	
	public void myInitMethod() {
		System.out.println("Inside init method");
		System.out.println("BeanInitialized");
	}
	
	public void cleanUpMethod() {
		System.out.println("Do all cleanup stuff here");
	}

}
