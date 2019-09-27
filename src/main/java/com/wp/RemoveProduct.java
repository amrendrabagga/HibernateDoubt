package com.wp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RemoveProduct {

	public static void main(String args[]) {
		
		Product p = new Product();
		p.setPcode(113);
		Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.delete(p);
		tr.commit();
		session.close();
		System.out.println("RECORD DELETED");
	}
}
