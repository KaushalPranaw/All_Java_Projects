package com.yash.pojos;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

	private int id;
	private String name;
	private String profession;

	public User() {
		super();
	}

	public User(int id, String name, String profession) {
		super();
		this.id = id;
		this.name = name;
		this.profession = profession;
	}

	public int getId() {
		return id;
	}

	@XmlElement
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	@XmlElement
	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", profession=" + profession + "]";
	}
	
	

}
