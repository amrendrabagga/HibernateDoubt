package com.wp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.wp.qbc.Util;

public class SecondLevelCache {

	public static void main(String[] args) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	      
	    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
		Session session1 = factory.openSession();
		//Session session1 = Util.getSF().openSession();
		
		Student s1 = (Student)session1.get(Student.class, 201);
		System.out.println(s1);
		
		Student s2 = (Student)session1.get(Student.class, 201);
		System.out.println(s2);
		
		//Session session2 = Util.getSF().openSession();
		Session session2 = factory.openSession();
		Student s3 = (Student)session2.get(Student.class, 201);
		System.out.println(s3);

	}

}
