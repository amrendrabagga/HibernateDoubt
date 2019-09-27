package com.wp;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateProduct {

	public static void main(String[] args) {
		Product p = new Product();
		p.setPcode(112);
		p.setPname("one plus 6T");
		p.setPrice(30000);

		Configuration config = new Configuration().configure();
		Session session = config.buildSessionFactory().openSession();
		
		//DML operation are permanent, thus to see changes we use transition
		Transaction tr = session.beginTransaction();
		session.update(p);
		tr.commit();
		session.close();
		System.out.println("RECORD UPDATED SUCCESSFULLY");
				
	}

}
