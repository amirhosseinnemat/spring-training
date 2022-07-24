package com.test;

import com.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {

        // in this test i want to delete last item

        // create factory and get session from factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        // begin transaction
        session.beginTransaction();

        // retrieve all objects
        int size = session.createQuery("from Student ").list().size();
        System.out.println(size);

        // get the last item
        Student student = session.get(Student.class, size);

        // way1
        /*

        session.delete(student);

        */

        // way 2
        session.createQuery("delete from Student where id =:id").setParameter("id", size).executeUpdate();

        // commit transaction
        session.getTransaction().commit();

        // close factory object
        factory.close();
    }
}
