package springdemoSecond;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//add the annotation here, spring will automatically register this bean with the id of that silly coach 
//@Component("thatSillyCoach")

// we changed it to make use of default bean ID
@Component
//@Scope("prototype")  // this makes a new instance each time we call it in the main app.java
public class TennisCoach implements Coach {
	
	// for DI, now we use Autowired so no stter method needed as this is field DI
	@Autowired
	//Qualifier to specify beans name , LOWER FIRST LETTER FOR QUALIFIER
	//@Qualifier("happyFortuneService")
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/* constructor DI with autowired
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/

	/*// Setter injection, we are making a default constructor
	public TennisCoach() {
		System.out.println("inside the default constructor");
	}
	// now the setter method of DI
	// we add autowired here 
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("inside the setter method");
		fortuneService = theFortuneService;
	}
	*/
	
	// we can also do method injection as we just need to add @autowired to that method 
	
	// define the init method 
	@PostConstruct 
	public void doMyStartupStuff() {
		System.out.println("inisde my doMystartupStuff");
	}
	// define the destroy method 
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("inisde my doMyCleanUpStuff");
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Tennis is hard so practice everyday for 2 mins lol";
	}

	@Override
	public String playLudo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
