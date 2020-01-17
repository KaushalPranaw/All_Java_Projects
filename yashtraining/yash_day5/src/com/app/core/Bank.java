package com.app.core;

public class Bank {

	private int bankId;
	private String bankName;
	private String ifscCode;

	
	//Non Static Inner Class
	/*public class Locker {
		private int lockerId;
		private int customerId;

		public Locker(int lockerId, int customerId) {
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


		void displayLockerDetails() {
			System.out.println(lockerId + " " + customerId);
		}
		void displayBankDetails() {
			System.out.println(bankId + " " + bankName + " " + ifscCode);
		}

	}*/
	/*void displayLockerDetails() {
		System.out.println(lockerId + " " + customerId);
	}
*/	

	//Static Inner Class
	public static class Locker
	{
		private int lockerId;
		private int customerId;
	
		
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
	
	
	public Bank(int bankId, String bankName, String ifscCode) {
		this.bankId = bankId;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
	}

	void displayBankDetails() {
		System.out.println(bankId + " " + bankName + " " + ifscCode);
	}
}
