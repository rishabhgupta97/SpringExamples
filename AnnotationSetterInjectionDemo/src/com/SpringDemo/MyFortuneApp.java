package com.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFortuneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/Springdemo/applicationContext.xml");
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BaseballCoach coach=context.getBean("baseballCoach",BaseballCoach.class);
	    System.out.println(coach.getDailyFortune());
	    System.out.println(coach.getDailyWorkout());
	}

}
