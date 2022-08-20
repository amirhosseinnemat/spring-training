package com.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jackson.json.demo.entity.Student;

import java.io.File;
import java.io.IOException;

public class Driver {
    public static void main(String[] args) {


        try {
            // object mapper

            ObjectMapper objectMapper = new ObjectMapper();

            Student student = objectMapper.readValue(new File("data/sample-lite.json"), Student.class);

            System.out.println(student);
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
