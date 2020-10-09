package com.ioc.Springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		Coach theCoach1 = context.getBean("myCoach1", Coach.class);
		System.out.println(theCoach1.getDailyWorkout());
		context.close();
	}

}
