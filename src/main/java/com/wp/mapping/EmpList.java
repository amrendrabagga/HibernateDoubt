package com.wp.mapping;

import java.util.List;

import org.hibernate.Criteria;
import com.wp.qbc.Util;

public class EmpList {

	public static void main(String[] args) {

			Criteria cr=Util.getSF().openSession().createCriteria(Emp.class);
			List<Emp> emps=cr.list();
			for(Emp emp:emps){
				System.out.println(emp.getEno());
				System.out.println(emp.getEname());
				System.out.println(emp.getSal());
				//System.out.println(emp.getLaptop().getCode());
				//System.out.println(emp.getLaptop().getBrand());
				//System.out.println(emp.getLaptop().getPrice());
				System.out.println("___________________________________");
			}
			

	}

}
