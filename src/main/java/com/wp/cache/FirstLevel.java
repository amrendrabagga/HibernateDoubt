package com.wp.cache;

import org.hibernate.Session;

import com.wp.Product;
import com.wp.qbc.Util;

public class FirstLevel {
	public static void main(String args[]) {
		Session session1 = Util.getSF().openSession();
		
		Product p1 = (Product)session1.get(Product.class, 111);
		System.out.println(p1);
		
		Product p2 = (Product)session1.get(Product.class, 111);
		System.out.println(p2);
		
		Session session2 = Util.getSF().openSession();
		Product p3 = (Product)session2.get(Product.class, 111);
		System.out.println(p3);
	}
}
