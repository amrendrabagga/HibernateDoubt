package com.wp.embeddable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SearchCustomer {

	public static void main(String args[]) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Customer.class);
		
		Session session = config.buildSessionFactory().openSession();
		
		
		Customer customer = session.get(Customer.class,111);
		System.out.println(customer);
		
		session.close();
	}
}
