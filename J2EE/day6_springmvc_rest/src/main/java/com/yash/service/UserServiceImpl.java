package com.yash.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yash.pojos.User;

@Service("user_service")
@Transactional
public class UserServiceImpl implements UserService {

	private static final AtomicLong counter = new AtomicLong();
	private static List<User> users;

	static {
		users = populateDummyUsers();
	}

	static List<User> populateDummyUsers() {
		return new ArrayList<User>(Arrays.asList(new User(1, "pranaw", 10, 1000), new User(2, "naresh", 10, 1000),
				new User(3, "rahul", 10, 1000)));

	}

	@Override
	public User findById(long id) {
		for (User u : users) {
			if (u.getId() == id)
				return u;

		}
		return null;
	}

	@Override
	public User findByName(String name) {
		for (User u : users) {
			if (u.getName().equalsIgnoreCase(name))
				return u;

		}
		return null;
	}

	@Override
	public void saveUser(User user) {
		user.setId(counter.incrementAndGet());
		users.add(user);

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUserById(long id) {
		Iterator<User> i = users.iterator();
		while (i.hasNext()) {
			User u = i.next();
			if (u.getId() == id)
				i.remove();
		}

	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public void deleteAllUsers() {
		users.clear();

	}

	@Override
	public boolean isUserExist(User user) {
		// TODO Auto-generated method stub
		return findByName(user.getName()) != null;
	}

}
