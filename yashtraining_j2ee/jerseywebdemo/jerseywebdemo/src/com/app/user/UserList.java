package com.app.user;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "userlist")
@XmlAccessorType(XmlAccessType.NONE)
public class UserList {

	List<User> users;

	public List<User> getUsers() {
		return users;
	}

	@XmlElement
	public void setUsers(List<User> users) {
		this.users = users;
	}

}
