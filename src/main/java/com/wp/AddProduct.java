package com.wp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddProduct {

	public static void main(String[] args) throws SecurityException {
		Product p1 = new Product(111,"iphone",100000);
		Product p2 = new Product(112,"realme 5",20000);
		Product p3 = new Product(113,"oneplus 6T",50000);
		
		Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction tr =session.beginTransaction();
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		tr.commit();
		session.close();
		System.out.println("RECORD ADDED SUCCESSFULLY");

	}

}
