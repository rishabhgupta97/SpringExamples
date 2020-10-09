package com.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FieldInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/Springdemo/applicationContext.xml");
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach=context.getBean("cricketCoach",Coach.class);
	    System.out.println(coach.getDailyFortune());
	    System.out.println(coach.getDailyWorkout());
	}

}
