package com.wp;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class SearchProduct {
	public static void main(String args[]) {
		Configuration config = new Configuration().configure();
		Session session = config.buildSessionFactory().openSession();
		Product p = session.get(Product.class, 112);
		System.out.println(p);
		
	}

}
