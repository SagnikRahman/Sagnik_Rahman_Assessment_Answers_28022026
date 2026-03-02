package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Launch {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();								// This loads the hibernate.cfg.xml file automatically
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t1 = s.beginTransaction();
		
		
//		Employee e1 = new Employee(1,"Avik Dutta","avik.d@gmail.com","9803000000");
//		Employee e2 = new Employee(2,"Rohit Das","rohit.d@gmail.com","9803000002");
//		Employee e3 = new Employee(3,"Megha Banerjee","megha.b@gmail.com","9803000003");
//		Employee e4  = new Employee(4,"Ananya Roy","ananya.roy@gmail.com","9803000003");
//		Employee e5  = new Employee(5,"Sourav Mitra","sourav.m@gmail.com","9803000004");
//		Employee e6  = new Employee(6,"Ritika Sharma","ritika.s@gmail.com","9803000005");
//		Employee e7  = new Employee(7,"Arindam Ghosh","arindam.g@gmail.com","9803000006");
//		Employee e8  = new Employee(8,"Neha Verma","neha.v@gmail.com","9803000007");
//		Employee e9  = new Employee(9,"Kunal Chatterjee","kunal.c@gmail.com","9803000008");
//		Employee e10 = new Employee(10,"Sneha Kapoor","sneha.k@gmail.com","9803000009");
//		
//		s.save(e1);
//		s.save(e2);
//		s.save(e3);
//		s.save(e4);
//		s.save(e5);
//		s.save(e6);
//		s.save(e7);
//		s.save(e8);
//		s.save(e9);
//		s.save(e10);
		
//		Employee e = s.get(Employee.class, 1);
//		s.delete(e);		
//		
		
		Employee e11 = s.get(Employee.class, 2);
		e11.setEmail("rohitd@gmail.com");
		
		t1.commit();
		
	}

}
