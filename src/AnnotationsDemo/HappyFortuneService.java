package AnnotationsDemo;

import org.springframework.stereotype.Component;

@Component

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
	
		return "You are so fuckin lucky today";
	}
	
	
	
	

}
