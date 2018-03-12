package com.diao.springannotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomService implements FortuneService {

    private String[] data = {
        "do you know this is random?",
        "this is good for part 2.",
        "this journey is rewarded."
    };

    private Random rand = new Random();

    @Override
    public String getFortune() {
        return data[rand.nextInt(data.length)];
    }
}
