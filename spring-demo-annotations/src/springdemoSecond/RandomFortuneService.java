package springdemoSecond;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// create an array of strings 
	private String[] data = {
			"Beware of the wolf in sheeps clothing",
			"second randome fortune service",
			"third random fortune service",
			"fourth random fortune service"
	};
	
	// create a rondom number generator
	private Random myRandom = new Random();
	
	
	@Override
	public String getFortune() {
		// pic a random string from the array
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
