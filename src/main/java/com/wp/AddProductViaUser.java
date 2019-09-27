package com.wp;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wp.qbc.Util;

public class AddProductViaUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pcode = sc.nextInt();
		String pname = sc.next();
		int price = sc.nextInt();
		Product product = new Product(pcode,pname,price);
		Session session = Util.getSF().openSession();
		Transaction tr = session.beginTransaction();
		session.save(product);
		tr.commit();
		session.close();
		System.out.println("Product added");
		sc.close();
	}

}
