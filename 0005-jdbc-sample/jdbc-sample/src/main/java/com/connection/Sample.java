package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample {

    final static String URL = "jdbc:mysql://localhost:3306/training";
    final static String USER = "root";
    final static String PASSWORD = "root";

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("connected successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
