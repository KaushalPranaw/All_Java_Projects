package com.app.core;

/*import com.app.core.Bank.Locker;*/

public class Customer {

	private int customerId;
	private Bank bank;
	private Bank.Locker locker;

	public Customer(int customerId, Bank bank, Bank.Locker locker) {
		super();
		this.customerId = customerId;
		this.bank = bank;
		this.locker = locker;
	}

	public Customer() {
		customerId = 1;
		bank = new Bank(11, "idbi bank", "IDBI00001022");
		/*locker = bank.new Locker(111, 1);*///for non static inner class
		locker=new Bank.Locker(111, 1);
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Bank.Locker getLocker() {
		return locker;
	}

	public void setLocker(Bank.Locker locker) {
		this.locker = locker;
	}

}
