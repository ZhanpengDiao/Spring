package com.diao.springdemo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    private String team;
    private String emailAddress;

    public CricketCoach() { // there is no constructor set for private field
        System.out.println("CricketCoach: inside constructor");
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter");
        this.fortuneService = fortuneService;
    }

    public String getTeam() {
        return team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside team setter");
        this.team = team;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside email setter");
        this.emailAddress = emailAddress;
    }


}
