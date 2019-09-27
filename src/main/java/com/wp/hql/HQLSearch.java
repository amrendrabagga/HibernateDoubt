package com.wp.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.wp.Product;
import com.wp.qbc.Util;

public class HQLSearch {

	public static void main(String[] args) {
		Session session = Util.getSF().openSession();
		
		//table emp - eno,ename,sal
		//class Employee - ecode,empname,salary
		//SQL - select eno,ename,sal from emp;//it is table based
		//HQL - select ecode,empname,salary from Employee;//it is class based
		//above query can be written as- from Employee
		
		//Query query = session.createQuery("from Product");
		Query query = session.createQuery("from Product order by price desc");
		List<Product> productList = query.list();
		for(Product product : productList) {
			System.out.println(product);
		}

	}

}
