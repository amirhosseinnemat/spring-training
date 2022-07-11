package com.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
        Coach coach = context.getBean("footballCoach", Coach.class);
        System.out.println(coach.getMyCoach());
        context.close();
    }
}
