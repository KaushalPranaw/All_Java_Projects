package tester;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		/* ArrayList<String> a=new ArrayList<String>();
		 ArrayList<?> a1=new ArrayList<String>();
		ArrayList<? extends Number> a2=new ArrayList<Integer>();
		a2.add(0,new Integer(1));*/
		
		//List<? extends Number> foo30 = new ArrayList<Number>();  // Number "extends" Number
		List<Number> foo31 = new ArrayList<>(); // Integer extends Number
	//	List<? extNumber> foo32 = new ArrayList<Double>();  // Double extends Number
		 foo31.add(2);
		 
		 ArrayList<? super Float> a=new ArrayList<>();
		 a.add(10f);
		a.add(10.0f);
a.add(10.22f);
		 System.out.println(a);
	}
}
