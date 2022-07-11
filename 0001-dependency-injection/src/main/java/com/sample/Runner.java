package com.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
        Car car = context.getBean("car", Car.class);
        car.print();
        context.close();
    }
}
