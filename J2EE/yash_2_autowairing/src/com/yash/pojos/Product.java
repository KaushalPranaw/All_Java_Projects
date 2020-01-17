package com.yash.pojos;

public class Product {

	private String name;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String name) {
		super();
		System.out.println("product");
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + "]";
	}
	
	public void display()
	{
		System.out.println(name);
	}

}
