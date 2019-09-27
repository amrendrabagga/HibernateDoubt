package com.wp.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import com.wp.Product;
import com.wp.qbc.Util;

public class HQLProjection {

	public static void main(String args[]) {
		Session session = Util.getSF().openSession();
		
		Query query = session.createQuery("select pcode,pname from Product order by price desc");
		List<Object[]> productList = query.list();
		for(Object[] obj : productList) {
			for(Object product : obj) {
				System.out.println(product);
			}	
			System.out.println("--------------------------------");
		}
		

	}
}
