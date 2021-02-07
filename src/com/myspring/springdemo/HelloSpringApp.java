package com.myspring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//calls method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		
		//let's call the methods for fortunes		
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
