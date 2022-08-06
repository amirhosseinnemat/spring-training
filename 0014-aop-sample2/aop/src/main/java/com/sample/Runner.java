package com.sample;

import com.sample.dao.AccountDAO;
import com.sample.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SampleConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        UserDao userDao = context.getBean("userDao", UserDao.class);

        accountDAO.setFamily("rahimi");
        accountDAO.setName("rahim");
        accountDAO.getFamily();
        accountDAO.getName();

        System.out.println("\n####################################\n");


        // close the context
        context.close();
    }
}
