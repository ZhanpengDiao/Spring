package com.diao.springannotations;

import org.springframework.stereotype.Component;

@Component // default component name is the class name with the first letter is lowercased
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
