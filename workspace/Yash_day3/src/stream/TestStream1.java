package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream1 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(0);
		list.add(10);
		list.add(501);
		list.add(110);
		list.add(21);
		list.add(150);
		System.out.println(list);
	
		//now filter even number form list and put into another
		/*
		//Without Stream until 1.7v
		List<Integer> list1=new ArrayList<>();
		for(int i:list)
		{
			if(i%2==0)
			{
				list1.add(i);
			}
		}
		System.out.println(list1);
		*/
		
		//using Stream concept
		List<Integer> list1=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list1);
		
	}
}
