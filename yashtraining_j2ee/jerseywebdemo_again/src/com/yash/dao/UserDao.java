package com.yash.dao;

import java.util.ArrayList;

import com.yash.core.User;
import com.yash.core.UserList;

public class UserDao {

	public User getUser()
	{
		User user=new User(1, "rahul", 43838);
		return user;
	}
	
	public UserList getUserList()
	{
		UserList list=new UserList();
		ArrayList<User> userList=new ArrayList<>();
		userList.add(new User(1, "pranaw", 43838));
		userList.add(new User(2, "rahul", 43838));
		userList.add(new User(3, "shubham", 43838));
		list.setUserList(userList);
		return list;
	}
	
	public String checkUserId(int id)
	{
		System.out.println("check dao");
		if(id==10)
			return "id available with "+id;
		else
			return null;
	}
}
