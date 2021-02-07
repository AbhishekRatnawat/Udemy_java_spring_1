package com.myspring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoAPP {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach aplhaCoach = context.getBean("myCoach", Coach.class);
		
		//Check if they are same bean
		
		boolean result = (theCoach == aplhaCoach);
		System.out.println("\n pointing to the same object: " + result);
		System.out.println("\n Memory location for theCoach: " + theCoach);
		System.out.println("\n Memory location for theCoach: " + aplhaCoach);
		
		//close the context
		
		context.close();

	}

}
