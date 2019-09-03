package AnnotationsDemo;

import org.springframework.stereotype.Component;

@Component

public class BasketBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {

		return "You should improve your jump";
	}

	@Override
	public String getDailyFortune() {
		return "Your Time will start from now basketball player";
	}

}
