package AnnotationsDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	
	@Autowired
	private FortuneService fortuneService;
	
	
	TennisCoach(){
		System.out.println("You are inside the deafult constructor ");
		
	}
	
	

	

	@Override
	public String getDailyWorkout() {
		return "Hello am the tennis coach you should STRENGTH YOUR SHOULDERS";
	}
	@Override
	public String getDailyFortune() {
		return "your time is now tennis player";
	}

}
