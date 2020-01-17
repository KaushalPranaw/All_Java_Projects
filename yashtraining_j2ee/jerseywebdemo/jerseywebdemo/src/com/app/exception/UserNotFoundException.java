package com.app.exception;

public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
		System.out.println(msg);
	}

}
