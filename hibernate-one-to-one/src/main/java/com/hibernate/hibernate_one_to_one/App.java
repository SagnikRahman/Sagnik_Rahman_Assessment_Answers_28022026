package com.hibernate.hibernate_one_to_one;

import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();

        Customer c = new Customer(1,"Sagnik","sagnik@gmail.com","Male",7044044852L,LocalDate.now());
        Order o = new Order(101,"ORD1001","Laptop",1,75000,LocalDate.now());

        c.setOrder(o);
        em.persist(c);

        et.commit();
        em.close();
        emf.close();
    }
}
