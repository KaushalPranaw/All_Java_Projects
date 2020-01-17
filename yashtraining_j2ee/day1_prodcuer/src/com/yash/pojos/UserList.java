package com.yash.pojos;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class UserList {

	private List<User> users;
	
	public UserList() {
		// TODO Auto-generated constructor stub
	}

	public List<User> getUsers() {
		return users;
	}

	@XmlElement
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
}
