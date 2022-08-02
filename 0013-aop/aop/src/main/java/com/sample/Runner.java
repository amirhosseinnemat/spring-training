package com.sample;

import com.sample.dao.AccountDAO;
import com.sample.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SampleConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        UserDao userDao = context.getBean("userDao", UserDao.class);
        accountDAO.addAccount();

        System.out.println("==========================================");

        userDao.add();
        // close the context
        context.close();
    }
}
