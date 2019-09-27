package com.wp.cache;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wp.qbc.Util;

public class AddStudent {

	public static void main(String[] args) {
		Session session = Util.getSF().openSession();
		Student s1= new Student(201,"amit",90);
		Student s2= new Student(202,"ameya",88);
		Student s3= new Student(203,"aditya",95);
		
		Transaction tr =session.beginTransaction();
		session.save(s1);
		session.save(s2);
		session.save(s3);
		tr.commit();
	}

}
