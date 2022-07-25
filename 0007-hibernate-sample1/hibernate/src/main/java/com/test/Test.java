package com.test;

import com.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        // create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

        // get session from session factory
        Session session = factory.getCurrentSession();

        Student student = null;
        try {

            // begin transaction
            session.beginTransaction();

            // create new student and add to session
//            student = new Student("masoud", "salehi");

//            session.save(student);
            student = session.get(Student.class, 1);
            student.setFirstName("javad");
            session.update(student);

            // commit transaction
            session.getTransaction().commit();

            // retrieve object
            session = factory.getCurrentSession();
            session.beginTransaction();

            Student student1 = session.get(Student.class, 2);
            Student student2 = session.get(Student.class, 3);
            System.out.println(student1 + "\n" + student2);

            // use hql for collecting data from db

            List<Student> students = session.createQuery("from Student").list();
            // printing data
            int i = 1;
            for (Student s : students) {
                System.out.println(i + "-> " + s.getFirstName() + " " + s.getLastName());
                i++;
            }

        } finally {
            System.out.println("process done.\n" + student.getFirstName() + " " + student.getLastName() + " added to database");
        }


        // close factory
        factory.close();
    }
}
