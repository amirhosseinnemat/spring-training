package com.sample;

import org.springframework.stereotype.Component;

@Component("footballCoach")
public class FootballCoach implements Coach{
    @Override
    public String getMyCoach() {
        return "Football Coach";
    }
}
