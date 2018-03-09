package com.diao.springdemo;

public class BaseballCoach implements Coach{

    //define a private field & a constructor for dependency injection
    private FortuneService fortuneService;
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
