package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream2_FIlter {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(0);
		list.add(10);
		list.add(501);
		list.add(110);
		list.add(21);
		list.add(150);
		System.out.println(list);
	
		//now perform double each element
		/*//without stream
		List<Integer> list1=new ArrayList<>();
		for(Integer i:list)
		{
			list1.add(i*2);
		}
		System.out.println(list1);
		 */
		
		//with stream
		List<Integer> list1=list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(list1);
		
		
	}
}
