package com.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity  
@Table(name="ADDRESS")  
public class Address {

	
	@Id  
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
	private int addressId;    
	private String city,state,country;    
	private int pincode;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private Employee employee;
	
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Address(int addressId, String city, String state, String country, int pincode, Employee employee) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.employee = employee;
	}
	public Address() {
		super();
		
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", pincode=" + pincode +  "]";
	}

	
	
	
	
	
	
}
