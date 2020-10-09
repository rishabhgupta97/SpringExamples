package com.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			
		Coach theCoach = context.getBean("myTCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		Coach theCoach1 = context.getBean("baseballCoach", Coach.class);
		System.out.println(theCoach1.getDailyWorkout());
		context.close();
	}

}
