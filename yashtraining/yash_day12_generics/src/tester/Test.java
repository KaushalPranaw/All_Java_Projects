package tester;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		//till 1.5v
		/*ArrayList a=new ArrayList();
		a.add("pranaw");
		String s=(String) a.get(0);
		System.out.println(s);*/
		
		ArrayList<Object> a=new ArrayList<Object>();
		a.add("pranaw");
		String s=(String)a.get(0);
		System.out.println(s);
		
		ArrayList<? extends Number> a1;
		a1=new ArrayList<>();
		a1.add(1, null);
		System.out.println(a1);
		
	}
}
