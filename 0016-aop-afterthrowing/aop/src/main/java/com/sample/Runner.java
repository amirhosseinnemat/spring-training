package com.sample;

import com.sample.dao.AccountDAO;
import com.sample.dao.UserDao;
import com.sample.file.FileReading;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.File;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SampleConfig.class);

        System.out.println("\n####################################\n");

        FileReading fileReading = context.getBean("fileReading", FileReading.class);
        try {
            fileReading.ReadFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n####################################\n");


        // close the context
        context.close();
    }
}
