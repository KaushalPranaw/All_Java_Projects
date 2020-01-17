package com.app.test;

import com.app.core.Bank;
import com.app.core.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		/*
		 * Bank bank = new Bank(102, "SBI bank", "SBI0000123"); Bank.Locker
		 * locker = bank.new Locker(112, 2); //for non static Customer customer
		 * = new Customer(2, bank, locker);
		 */

		Customer customer = new Customer(2, 
					new Bank(12, "SBI bank", "SBI0000123"), 
					new Bank.Locker(112, 2));

	}
}
