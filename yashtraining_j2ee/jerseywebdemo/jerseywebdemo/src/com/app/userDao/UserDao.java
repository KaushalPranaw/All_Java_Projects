package com.app.userDao;

import java.util.ArrayList;

import com.app.user.User;
import com.app.user.UserList;

public class UserDao {

	public User getUser() {
		User u = new User(1, "Shubham");
		return u;
	}

	public UserList getUsersList() {
		UserList ul = new UserList();
		ArrayList<User> usrlist = new ArrayList<>();
		usrlist.add(new User(1, "Shubham"));
		usrlist.add(new User(2, "ABC"));
		usrlist.add(new User(3, "XYZ"));
		usrlist.add(new User(4, "PQR"));
		usrlist.add(new User(5, "RST"));
		usrlist.add(new User(6, "LMN"));
		usrlist.add(new User(7, "HIJ"));
		ul.setUsers(usrlist);
		return ul;
	}

	public String checkUserById(int id) {
		if (id == 10) {
			return "User with Id : " + id + " is Avaliable";
		} else
			return null;
	}
}
