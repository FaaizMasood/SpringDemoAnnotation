package springdemoSecond;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config file to read spring java configuration file 
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from the container -(previous)
		//Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		
		// we changed to make use for default bean ID - (current) // method name was the bean ID remember??.. changed it to swim coach 
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// practive activity 
		//Coach aCoach = context.getBean("ludoCoach", Coach.class);
		
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call a method on the bean
		//System.out.println(aCoach.playLudo());
		
		// call our new mwthods for swim coach class.. has props value injected 
		System.out.println("email: " + theCoach.getEmail());
		
		System.out.println("Team: " + theCoach.getTeam());
		
		//call the method for daily fortune that used Autowired for contructor DI
		System.out.println(theCoach.getDailyFortune());
				
		// close the contect
		context.close();
	}

}
