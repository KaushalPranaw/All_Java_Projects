package com.app.core;

public class Bank1 {

	private int bankId;
	private String bankName;
	private String ifscCode;

	public Bank1(int bankId, String bankName, String ifscCode) {
		this.bankId = bankId;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
	}

	public void displayBankDetails() {
		System.out.println(bankId + " " + bankName + " " + ifscCode);
	}
	
	public Object lockerDetails()
	{
		class Locker
		{
			private int lockerId;
			private int customerId;
		
			public Locker() {
				// TODO Auto-generated constructor stub
			}
			public Locker(int lockerId, int customerId) {
				super();
				this.lockerId = lockerId;
				this.customerId = customerId;
			}
			public int getLockerId() {
				return lockerId;
			}
			public void setLockerId(int lockerId) {
				this.lockerId = lockerId;
			}
			public int getCustomerId() {
				return customerId;
			}
			public void setCustomerId(int customerId) {
				this.customerId = customerId;
			}
			
			
			
			@Override
			public String toString() {
				return "Locker [lockerId=" + lockerId + ", customerId=" + customerId + "]";
			}
			void display()
			{
				System.out.println(lockerId+" "+customerId);
			}
			
		}
		Locker locker=new Locker(2,2);
		locker.display();
		
		return locker;
		 
		
	}
	
	
	
	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	
	
}
