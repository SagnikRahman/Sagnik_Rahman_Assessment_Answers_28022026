package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Launch {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Employee.class);

        SessionFactory sf = cfg.buildSessionFactory();

        // INSERT
        Session s1 = sf.openSession();
        Transaction t1 = s1.beginTransaction();

        Employee e1 = new Employee(1,"Avik Dutta","avik.d@gmail.com","9803000000",3000);
        Employee e2 = new Employee(2,"Rohit Das","rohit.d@gmail.com","9803000002",4000);
        Employee e3 = new Employee(3,"Megha Banerjee","megha.b@gmail.com","9803000003",5000);
        Employee e4 = new Employee(4,"Ananya Roy","ananya.roy@gmail.com","9803000004",6000);

        s1.save(e1);
        s1.save(e2);
        s1.save(e3);
        s1.save(e4);

        t1.commit();
        s1.close();

        // FETCH
        Session s2 = sf.openSession();
        Employee fetched = s2.get(Employee.class, 2);
        System.out.println("Fetched Employee: " + fetched.getName());
        s2.close();

        // UPDATE
        Session s3 = sf.openSession();
        Transaction t2 = s3.beginTransaction();

        Employee empToUpdate = s3.get(Employee.class, 2);
        empToUpdate.setSalary(10000);

        t2.commit();
        s3.close();

        // DELETE
        Session s4 = sf.openSession();
        Transaction t3 = s4.beginTransaction();

        Employee empToDelete = s4.get(Employee.class, 1);
        s4.delete(empToDelete);

        t3.commit();
        s4.close();

        sf.close();
    }
}