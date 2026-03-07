package com.hibernate.hibernate_cust_ord_crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class OrderDAOImpl {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");


    public void updateOrder(Order order){

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.merge(order);
        tx.commit();

        em.close();
    }


    public Order fetchOrderById(int id){

        EntityManager em = emf.createEntityManager();
        Order order = em.find(Order.class,id);

        em.close();

        return order;
    }
}