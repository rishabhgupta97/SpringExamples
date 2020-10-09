package com.Springdemo;

public class CricketCoach implements Coach {
	FortuneService fortuneService;
	String name;
	int points;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Inside setter method");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "pracice on nets daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Inside daily fortune";
	}
	public void display(){
		System.out.println(name);
	}

}
