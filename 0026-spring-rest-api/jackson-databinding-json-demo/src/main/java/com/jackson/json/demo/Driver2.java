package com.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jackson.json.demo.entity.Student;

import java.io.File;

public class Driver2 {
    public static void main(String[] args) {

        try {
            // create object mapper
            ObjectMapper mapper = new ObjectMapper();

            Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);

            System.out.println(student);



        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
