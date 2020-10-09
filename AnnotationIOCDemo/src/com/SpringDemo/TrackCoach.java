package com.SpringDemo;

import org.springframework.stereotype.Component;

@Component("myTCoach")
public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hi run daily 5km";
	}
	
	

}
