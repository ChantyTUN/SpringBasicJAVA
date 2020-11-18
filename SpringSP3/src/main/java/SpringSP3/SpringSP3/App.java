package SpringSP3.SpringSP3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new
    			ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Coach coach=context.getBean("pingPongCoach",Coach.class);
     
      
      System.out.println(coach.getWork());
    }
}
