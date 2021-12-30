package springdemoSecond;

import org.springframework.stereotype.Component;

@Component
public class LudoCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String playLudo() {
		
		return "Roll the dice to play the game sillyyyy";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
