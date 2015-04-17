package com.luodexin.struts2.beans;

public class Product {
	private String id;
	private String name;
	private String desc;
	private String price;
	
	public Product() {	}

	public Product( String name, String desc, String price) {
		super();
//		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", desc=" + desc
				+ ", price=" + price + "]";
	}
	
	
	
}
