package com.yash.core;

public class Address {

	private String area;
	private String city;
	private String country;

	public Address() {
		System.out.println("in const "+getClass().getName());
	}

	public Address(String area, String city, String country) {
		super();
		this.area = area;
		this.city = city;
		this.country = country;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + ", country=" + country + "]";
	}

}
