package com.test;

import com.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        session.beginTransaction();
        // get all students that first name = amir with hql
        List<Student> students = session.createQuery("from Student s where s.lastName = 'karimi'").list();
        int i = 1;
        for (Student s: students) {
            System.out.println(i + " -> " + s.getFirstName() + " " + s.getLastName() + " - id : " + s.getId());
        }


        factory.close();
    }
}
