package springdemoSecond;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve the bean from spring container 
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		// check if they are smae object
		
		boolean result = (theCoach == alphaCoach);
		
		// print out to check 
		System.out.println("pointing to Same object??" + result);
		
		System.out.println("Memory location of the thecoach" + theCoach);
		
		System.out.println("Memory location of the alphacoach" + alphaCoach);
		
		// close the context
		context.close();
		
	}

}
