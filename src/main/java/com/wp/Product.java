package com.wp;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
//@Table(name = "items")//to specify table name
public class Product {
	@Id
	//@Column(name = "productID")
	private int pcode;
	//@Column(name = "ProductName")
	private String pname;
	//@Column(name = "Price")
	private Integer price;
	
	public Product() {
		super();
	}
	public Product(int pcode, String pname, int price) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.price = price;
	}
	
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pcode=" + pcode + ", pname=" + pname + ", price=" + price + "]";
	}
	
	
}
