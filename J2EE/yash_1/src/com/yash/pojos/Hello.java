package com.yash.pojos;

public class Hello {

	private String msg1;
	// private String msg2;

	public Hello() {
		System.out.println("in const " + getClass().getName());
	}

	public Hello(String msg1, String msg2) {
		super();
		this.msg1 = msg1;
		// this.msg2 = msg2;
	}

	public String getMsg1() {
		return msg1;
	}

	public void setMsg1(String msg1) {
		this.msg1 = msg1;
	}

	/*
	 * public String getMsg2() { return msg2; }
	 * 
	 * 
	 * public void setMsg2(String msg2) { this.msg2 = msg2; }
	 */

	public void initHello() {
		System.out.println("init hello()");
	}

	public void destroyHello() {
		System.out.println("destroy hello()");
	}

}
