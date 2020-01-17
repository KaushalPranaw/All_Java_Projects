package tester;

import core.Interf;
import core.Interf2;

public class Test implements Interf,Interf2 {

	public static void main(String[] args) {
		Interf i=new Test();
		i.display();
		Interf.displayStatic();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		Interf2.super.display();
	}
}
