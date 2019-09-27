package com.wp.embeddable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private int cno;
	@Column(name = "cname",nullable = false)
	private String cname;
	private Address address;
	
	public Customer() {
		super();
		
	}
	public Customer(int cno, String cname, Address address) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.address = address;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", address=" + address + "]";
	}

}
