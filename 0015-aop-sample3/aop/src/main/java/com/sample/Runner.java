package com.sample;

import com.sample.dao.AccountDAO;
import com.sample.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SampleConfig.class);

        System.out.println("\n####################################\n");

        UserDao userDao = context.getBean("userDao", UserDao.class);
        userDao.add("ali");

        System.out.println("\n####################################\n");


        // close the context
        context.close();
    }
}
