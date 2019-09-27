package com.wp.cache;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.wp.qbc.Util;

public class QueryLevelCache {

	public static void main(String[] args) {
	
			Session session = Util.getSF().openSession();
			//HQL
			Query query1 = session.createQuery("select sname from Student");
			query1.setCacheable(true);
			List<String> list1 = query1.list();
			for(String name : list1) 
				System.out.println(name);
				

			Query query2 = session.createQuery("select sname from Student");
			query2.setCacheable(true);
			List<String> list2 = query1.list();
			for(String name : list2) 
				System.out.println(name);

			Query query3 = session.createQuery("select sname from Student");
			query3.setCacheable(true);
			List<String> list3 = query3.list();
			for(String name : list3) 
				System.out.println(name);


	}

}
