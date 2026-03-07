package com.hibernate.hibernate_cust_ord_crud;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CustomerDAOImpl {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");

    public void insertCustomer(Customer c) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.persist(c);
        tx.commit();

        em.close();
    }


    public void updateCustomer(Customer c) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.merge(c);
        tx.commit();

        em.close();
    }


    public void deleteCustomer(int id) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Customer c = em.find(Customer.class, id);

        if(c!=null)
            em.remove(c);

        tx.commit();
        em.close();
    }


    public Customer fetchCustomerById(int id) {

        EntityManager em = emf.createEntityManager();

        Customer c = em.find(Customer.class,id);

        em.close();

        return c;
    }


    public List<Customer> fetchAllCustomers(){

        EntityManager em = emf.createEntityManager();

        List<Customer> list = em.createQuery("FROM Customer",Customer.class).getResultList();

        em.close();

        return list;
    }


    // JPQL Query
    public Customer fetchCustomerByEmail(String email){

        EntityManager em = emf.createEntityManager();

        Customer c = em.createQuery(
                "SELECT c FROM Customer c WHERE c.email = :email",
                Customer.class)
                .setParameter("email", email)
                .getSingleResult();

        em.close();

        return c;
    }
}