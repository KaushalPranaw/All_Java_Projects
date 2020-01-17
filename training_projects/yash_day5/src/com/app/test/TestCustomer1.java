package com.app.test;

import com.app.core.Bank1;

public class TestCustomer1 {

	public static void main(String[] args) {
		
		Bank1 bank=new Bank1(111, "SBI bank", "SBI0000222");
		 bank.displayBankDetails();
		 bank.lockerDetails();

		 System.out.println(bank.lockerDetails());
		 
	}
}
