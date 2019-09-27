package com.wp.qbc.advance;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.wp.Product;
import com.wp.qbc.Util;

public class UsingCriteriaQuery {

	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		Session session = Util.getSF().openSession();
		
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		
		Root<Product> root = cq.from(Product.class);
		cq.select(root);
		
		//fetching table
		TypedQuery<Product> query = session.createQuery(cq);
		List<Product> list = query.getResultList();
		for(Product p : list)
			System.out.println(p);
		
		//fetching product whose value is greater than 20000
		cq.select(root).where(cb.greaterThanOrEqualTo(root.<Integer>get("price"), Integer.valueOf(20000)));
//		cq.select(root).where(cb.equal(root.get("pcode"),111));
		System.out.println("==========================");
		TypedQuery<Product> query1 = session.createQuery(cq);
		 
		  List<Product> results = query1.getResultList();
		  for(Product pr : results)
				System.out.println(pr);
		  
		  System.out.println("===================");
		  //projection using criteriaQuery
		  CriteriaQuery<Integer> query2 = cb.createQuery(Integer.class);
		  Root<Product> root2 = query2.from(Product.class);
		  query2.select(root2.<Integer>get("price"));
		 List<Integer> results2 = session.createQuery(query2).getResultList();
		 for(Integer price:results2)
			 System.out.println(price);
		  
		  
		  
//		  cq.multiselect(root.get("pname"),root.get("price"),root.get("pcode"));
//		 List<Product> results2 = session.createQuery(cq).getResultList();
//		 for(Product prd:results2) {
//			 System.out.println(prd);
//		 }
		  
	}
}
