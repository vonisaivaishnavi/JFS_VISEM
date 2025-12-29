package com.skillnext;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.skillnext.HibernateUtil;
import com.skillnext.Student;

public class App {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student std = new Student(
                "Mayuri",
                6,
                "cse"
        );

        session.persist(std);

        tx.commit();
        session.close();

        System.out.println("Student inserted successfully!");
    }
}

