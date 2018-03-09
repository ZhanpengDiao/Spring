package com.diao.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterDemoApp {

    public static void main(String[] args) {
        // load the spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/diao/springdemo/applicationContext.xml");

        // retrieve bean from spring container
        CricketCoach cc = context.getBean("myCricketCoach", CricketCoach.class);

        // call method from bean
        System.out.println(cc.getDailyWorkout());
        System.out.println(cc.getDailyFortune());

        // call method to get the literal values
        System.out.println(cc.getTeam());
        System.out.println(cc.getEmailAddress());

        // close the context
        context.close();
    }
}
