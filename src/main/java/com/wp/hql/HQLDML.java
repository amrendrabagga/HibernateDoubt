package com.wp.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wp.qbc.Util;

public class HQLDML {

	public static void main(String args[]) {
		Session session = Util.getSF().openSession();
		String sql = "update Product set price=price+10";
		Query query = session.createQuery(sql);
	
		Transaction tr = session.beginTransaction();
	
		int n = query.executeUpdate();
		tr.commit();
		System.out.println(n+" rows affected");
	}
}
