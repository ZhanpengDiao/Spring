package com.diao.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        // load the configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/diao/springdemo/beanScopeApplicationContext.xml");

        // retrieve bean from container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach theCoachCopy = context.getBean("myCoach", Coach.class);


    }

}
