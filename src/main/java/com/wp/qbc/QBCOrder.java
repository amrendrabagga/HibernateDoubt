package com.wp.qbc;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import com.wp.Product;

public class QBCOrder {
	public static void main(String args[]) {
		Session session = Util.getSF().openSession();
		//order by follow precedence, ie which applied first has higher priority
		Order order1 = Order.asc("price");
		Order order2 = Order.asc("pcode");
		Criteria criteria = session.createCriteria(Product.class);
		criteria.addOrder(order1);
		criteria.addOrder(order2);
		List<Product> productList = criteria.list();
		for(Product product : productList) {
			System.out.println(product);
		}
	}

}
