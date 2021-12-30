package springdemoSecond;

import org.springframework.stereotype.Component;

// @Component for spring to scan as a component
@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Hello Faaiz , Today you will have a good day!!!!";
	}

}
