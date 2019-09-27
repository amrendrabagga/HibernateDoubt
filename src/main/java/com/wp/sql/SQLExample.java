package com.wp.sql;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.wp.Product;
import com.wp.qbc.Util;

public class SQLExample {

	public static void main(String args[]) {
		Session session = Util.getSF().openSession();
		SQLQuery query= session.createSQLQuery("select *from product");
		query.addEntity(Product.class);
		List<Product> list = query.list();
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
