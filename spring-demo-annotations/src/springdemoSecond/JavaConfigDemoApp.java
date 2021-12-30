package springdemoSecond;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config file to read spring java configuration file 
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from the container -(previous)
		//Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		
		// we changed to make use for default bean ID - (current)
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// practive activity 
		//Coach aCoach = context.getBean("ludoCoach", Coach.class);
		
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call a method on the bean
		//System.out.println(aCoach.playLudo());
		
		//call the method for daily fortune that used Autowired for contructor DI
		System.out.println(theCoach.getDailyFortune());
				
		// close the contect
		context.close();
	}

}
