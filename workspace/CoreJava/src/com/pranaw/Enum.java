package com.pranaw;



public class Enum {
	enum Days
	{
		SUN,MON,TUES,WED,THURS,FRI,SAT;
	}
	public static void main(String[] args) {
		Days d;
		d=Days.SUN;
		System.out.println(d);
	}
}
