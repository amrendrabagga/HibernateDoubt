package com.wp.qbc;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.wp.Product;

public class QCBFilteration {

	public static void main(String argsp[]) {
		Session session = Util.getSF().openSession();
		Criteria criteria = session.createCriteria(Product.class);
		
		//Criterion crt=Restrictions.gt("price", 20000);
		//Criterion crt = Restrictions.eq("pname", "iphone");
		//similarly - ge,lt,le
		//Criterion crt = Restrictions.between("price",15000,30000);
		
//		List<String> names = new ArrayList<String>();
//		names.add("iphone");
//		names.add("realme");
//		Criterion crt = Restrictions.in("pname",names);
		
//		Criterion crt1 = Restrictions.in("pname","iphone","realme");
//		criteria.add(crt1);
		
		Criterion crt1 = Restrictions.like("pname","i%");
		Criterion crt2 = Restrictions.gt("price",50000);
		Criterion ctr = Restrictions.and(crt1,crt2);
		
		criteria.add(ctr);
		List<Product> productList = criteria.list();
		for(Product product : productList) {
			System.out.println(product);
		}
	}
}
