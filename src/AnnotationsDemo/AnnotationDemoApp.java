package AnnotationsDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Coach theCoach = context.getBean("basketBallCoach",Coach.class);
		Coach theCoac = context.getBean("tennisCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoac.getDailyWorkout());
		System.out.println(theCoac.getDailyFortune());
		
		
		context.close();
		

	}

}
