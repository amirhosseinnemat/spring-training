package com.test;

import com.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestUpdate {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        // retrieve student with id = 2
        Student student = session.get(Student.class, 2);
        System.out.println(student);

        student.setFirstName("arman");

        // commit the changes
        session.getTransaction().commit();

        System.out.println(student);


        factory.close();
    }
}
