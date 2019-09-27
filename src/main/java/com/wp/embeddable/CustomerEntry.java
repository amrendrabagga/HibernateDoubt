package com.wp.embeddable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerEntry {

	public static void main(String[] args) {
		
		Address address = new Address (12,"indore","M.P.");
		Customer c = new Customer(111,"amrendra",address);
		//without mapping Entity class customer in xml file we can use it using addAnnotatedClass
		Configuration config = new Configuration().configure().addAnnotatedClass(Customer.class);
		
		//Configuration config = new Configuration().configure();//with mapping in .xml
		Session session = config.buildSessionFactory().openSession();
		
		//here without transaction table will be created
		//but record wont be added as DML are not auto-commit
		Transaction tr = session.beginTransaction();
		session.save(c);
		tr.commit();
		session.close();
		System.out.println("RECORD CREATED");
		
	}

}
