package com.diao.springdemo;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "TODAY is your lucky day!";
    }

}
