package com.hibernate.Hibernate_020326;

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
    	
    	// CREATE
    	
    	et.begin();
    	
    	Student s1 = new Student();
    	s1.setName("Sagnik");
    	s1.setEmail("sagnikr@gmail.com");
    	s1.setMobile("7044044852");
    	em.persist(s1);
      
    	Student s2 = new Student("Rohan","rohand@gmail.com","7044023412");
    	em.persist(s2);
    	
    	et.commit();
    	
    	// READ 
    	Student s3 = em.find(Student.class, 1);
        if (s3 != null) {
            System.out.println(s3.getId() + " " + s3.getName() + " " + s3.getEmail() + " " + s3.getMobile());
        }

        // UPDATE
        et.begin();

        Student s4 = em.find(Student.class, 2);
        if (s4 != null) {
        	s4.setEmail("updated@gmail.com");
        	s4.setMobile("6291680000");
        }

        et.commit();

        //DELETE
        et.begin();

        Student s5 = em.find(Student.class, 1);
        if (s5 != null) {
            em.remove(s5);
        }

        et.commit();

    }
}
