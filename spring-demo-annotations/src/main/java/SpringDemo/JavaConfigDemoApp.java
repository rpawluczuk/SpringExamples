package SpringDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("SpringDemo");

        //get the bean from spring container
        CalisthenicCoach theCoach = context.getBean("calisthenicCoach", CalisthenicCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call a method to get daily fortune
        System.out.println(theCoach.getDailyFortune());

        // close context
        context.close();
    }
}
