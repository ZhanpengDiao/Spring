package com.diao.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp { // using init-method and destory-method // customized hooks

    public static void main(String[] args) {

        // load the spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/diao/springdemo/beanLifeCycleApplicationContext.xml");

        // retrieve bean from container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        // close the container
        context.close();

    }

}
