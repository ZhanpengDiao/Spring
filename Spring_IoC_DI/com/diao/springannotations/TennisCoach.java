package com.diao.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component // default component name is the class name with the first letter is lowercased
public class TennisCoach implements Coach{
    @Autowired
    @Qualifier("randomService") // bean id
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("inside TennisCoach default constructor");
    }

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("inside doMyStartUpStuff");
    }

    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("inside doMyCleanUpStuff");
    }

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println("inside TennisCoach setFortuneService method");
//        this.fortuneService = fortuneService;
//    }

//    @Autowired
//    public void fakeSetFortuneService(FortuneService fortuneService) {
//        System.out.println("inside TennisCoach fakeSetFortuneService method");
//        this.fortuneService = fortuneService;
//    }

//    @Autowired // spring will scan components which meet the requirement
//    TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
