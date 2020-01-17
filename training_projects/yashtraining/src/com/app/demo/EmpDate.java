package com.app.demo;
 

public class EmpDate {

	 private int dd;
	 private int mm;
	 private int yyyy;
	public EmpDate(int dd, int mm, int yyyy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	public EmpDate() {
		super();
	}
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYyyy() {
		return yyyy;
	}
	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}
	@Override
	public String toString() {
		return   dd + "/" + mm + "/" + yyyy ;
	}
	
	 
	 
}
