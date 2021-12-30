package springdemoSecond;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a Sad day Faaiz But you will do great";
	}

}
