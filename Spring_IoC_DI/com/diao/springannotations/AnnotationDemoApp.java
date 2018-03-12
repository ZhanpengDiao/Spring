package com.diao.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        // read Spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/diao/springannotations/applicationContext.xml");

        // get bean from container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // call the bean method
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();

    }
}
