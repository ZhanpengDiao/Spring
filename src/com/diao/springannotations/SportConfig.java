package com.diao.springannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.diao.springannotations") // works like xml config //
public class SportConfig {
    @Bean // define a bean // create an instance an return it
    public FortuneService happyFortuneService() {
       return new HappyFortuneService();
    }

    @Bean
    public Coach swimCoach(FortuneService fortuneService) {
        SwimCoach mySwimCoach = new SwimCoach(happyFortuneService());
        return mySwimCoach;
    }

}
