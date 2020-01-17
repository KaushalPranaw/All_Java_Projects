package com.app.tester;

import com.threaddemo.Volatile;

public class TestVolatile {

	public static void main(String[] args) {
		System.out.println(10.053678777f);
	}

	public static void main1(String[] args) {
		Volatile v = new Volatile();
		Thread t = new Thread(v) {

			@Override
			public void run() {
				v.print();
			}

		};
		Thread t1 = new Thread(v) {

			@Override
			public void run() {
				v.print();
			}

		};
		t.start();
		t1.start();
	}
}
