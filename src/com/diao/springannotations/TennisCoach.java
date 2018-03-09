package com.diao.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // default component name is the class name with the first letter is lowercased
public class TennisCoach implements Coach{
    private FortuneService fortuneService;

    @Autowired // spring will scan components which meet the requirement
    TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
