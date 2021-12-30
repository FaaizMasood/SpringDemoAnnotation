package springdemoSecond;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// Step 1 add the annotation for configuration 
@Configuration
// Step two for component scanning , find all the classes that has component annotation and register them in the spring container 
//@ComponentScan("springdemoSecond")
// anotation for property source
@PropertySource("classpath:sport.properties")
public class SportConfig {

	
	// defining a method to expose a bean , for our sad fortune service // method name is the bean ID
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define a bean for our swim coach and inject dependency 
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
