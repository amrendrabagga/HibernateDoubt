package com.wp.qbc;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.wp.Product;

public class QBCProjection {

	public static void main(String[] args) {
		Session session = Util.getSF().openSession();
		
		ProjectionList projectionList = Projections.projectionList();
		Projection prj1 = Projections.property("pcode");
		Projection prj2 = Projections.property("pname");
		projectionList.add(prj1);
		projectionList.add(prj2);
		
		Criteria criteria = session.createCriteria(Product.class);
		criteria.setProjection(projectionList);
		//in case of projection criteria.list returns List<Object[]>
		List<Object[]> productList = criteria.list();
		for(Object[] obj : productList) {	
			for(Object productItems : obj) {
				System.out.println(productItems);
				
			}
			System.out.println("---------------------------------");
		}
	}
}


