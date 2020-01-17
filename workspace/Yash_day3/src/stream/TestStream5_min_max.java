package stream;

import java.util.ArrayList; 

public class TestStream5_min_max {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(0);
		list.add(10);
		list.add(501);
		list.add(4);
		list.add(1);
		list.add(150);
		System.out.println(list);
	 
		int min=list.stream().min((i1,i2)->i1.compareTo(i2)).get();//asecnding first one is min in descending maximum value in min
		System.out.println(min);
		int max=list.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
		
		
		
		
		
	}
}
