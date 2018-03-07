package com.diao.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
        // load the spring config fire
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach coach2 = context.getBean("myCoach", Coach.class); //  args: beanID, interface
        // provide the type information to ensure safety

        // call methods on the bean
        System.out.println(coach2.getDailyWorkout());

        // call the new method for fortunes
        System.out.println(coach2.getDailyFortune());

        // close the context
        context.close();
    }

}
