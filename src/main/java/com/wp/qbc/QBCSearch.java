package com.wp.qbc;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.wp.Product;

public class QBCSearch {

	public static void main(String[] args) {
		SessionFactory sessionFactory = Util.getSF();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Product.class);
		List<Product> productList = criteria.list();
		for(Product product : productList) {
			System.out.println(product);
		}
	}

}
