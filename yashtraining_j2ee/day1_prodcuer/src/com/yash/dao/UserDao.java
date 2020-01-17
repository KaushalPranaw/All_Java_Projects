package com.yash.dao;

import java.util.ArrayList;

import com.yash.pojos.User;
import com.yash.pojos.UserList;

public class UserDao {

	public User getUser() {
		return new User(1, "pranaw", "Java developer");
	}
	
	public UserList getAllList()
	{
		UserList users=new UserList();
		
		ArrayList<User> a=new ArrayList<>();
		a.add(new User(1, "a", "a"));
		a.add(new User(2, "a", "a"));
		a.add(new User(3, "a", "a"));
		a.add(new User(4, "a", "a"));
		
		users.setUsers(a);
		
		return users;
	}
}
