package com.yash.pojos;

public class Customer {

	private Product product;

	private int id;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Product product, int id) {
		super();
		System.out.println("cust");
		this.product = product;
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		System.out.println("setter");
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Customer [product=" + product + ", id=" + id + "]";
	}
	
	public void display()
	{
		System.out.println(id);
		product.display();
	}

}
