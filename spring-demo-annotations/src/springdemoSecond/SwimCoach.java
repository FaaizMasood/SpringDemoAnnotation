package springdemoSecond;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	// define fields ti inject them to read data from propertied file
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
	

	// Swim coach need a fortune service as a dempendcy injection 
	private FortuneService fortuneService;
	
	// we will use constructer DI
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	@Override
	public String getDailyWorkout() {
		return "Swim 100 meters as a warmup ";
	}

	@Override
	public String playLudo() {
		return null;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
