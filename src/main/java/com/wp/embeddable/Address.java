package com.wp.embeddable;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private int hno;
	private String city;
	private String state;
	public Address() {
		super();
	
	}
	public int getHno() {
		return hno;
	}
	
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + ", state=" + state + "]";
	}
	public Address(int hno, String city, String state) {
		super();
		this.hno = hno;
		this.city = city;
		this.state = state;
	}
	

}
