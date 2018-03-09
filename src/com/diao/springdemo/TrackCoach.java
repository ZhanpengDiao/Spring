package com.diao.springdemo;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it! " + fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff() {
       System.out.println("TrackCoach: inside doMyStartupStuff");
    }

    // add a destory method
    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: inside doMyCleanupStuff");
    }
}
