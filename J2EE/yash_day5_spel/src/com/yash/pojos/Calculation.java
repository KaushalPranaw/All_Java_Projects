package com.yash.pojos;

import org.springframework.beans.factory.annotation.Value;

public class Calculation {

	@Value("#{50}")
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int cube()
	{
		return number*number*number;
	}
}
