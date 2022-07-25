package com.sample.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Instructor.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        Instructor instructor = new Instructor("amir","nemat","amirnemat@gmail.com");
        InstructorDetail instructorDetail = new InstructorDetail("amir2nt6", "football");
//        instructor.setInstructorDetail(instructorDetail);



        session.beginTransaction();

        session.save(instructorDetail);
        session.save(instructor);

        session.getTransaction().commit();

        session.close();
        factory.close();

    }
}
