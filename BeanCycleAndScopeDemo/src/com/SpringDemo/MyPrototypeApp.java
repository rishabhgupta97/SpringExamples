package com.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyPrototypeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		Coach theCoach1 = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach1.getDailyWorkout());
		
		boolean b= theCoach==theCoach1;
		System.out.println("Both bean points to same shared location : "+b);
		System.out.println("Address of theCoach: "+theCoach);
		System.out.println("Address of theCoach: "+theCoach1);
		
		
		context.close();
	}

}
