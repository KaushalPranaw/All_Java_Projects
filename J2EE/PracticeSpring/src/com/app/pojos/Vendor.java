package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name="vendor")
public class Vendor 
{

	private Integer id;
	private String email,password,name,city;
	private String role;
	@Override
	public String toString() {
		return   id +   email +   password +  name + city
				+   role;
	}
	public Vendor() {
		super();
	}
	public Vendor(Integer id, String email, String password, String name, String city, String role) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.city = city;
		this.role = role;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(length=20)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(length=20)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(length=20)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(length=20)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(length=20)
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
