package com.wp.hql;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wp.qbc.Util;

public class HQLDMLParameterized {

	public static void main(String[] args) {
		Session session = Util.getSF().openSession();
		System.out.println("Enter amount and code");
		Scanner scanner = new Scanner(System.in);
		int amt = scanner.nextInt();
		int pc = scanner.nextInt();
				
		String sql = "update Product set price=price+:amount where pcode=:code";
		Query query = session.createQuery(sql);
		
		Transaction tr = session.beginTransaction();
		query.setParameter("amount",amt);
		query.setParameter("code",pc);
		int n = query.executeUpdate();
		
		tr.commit();
		System.out.println(n+" rows affected");
	}

}
