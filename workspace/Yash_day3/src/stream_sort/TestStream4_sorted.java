package stream_sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; 

public class TestStream4_sorted {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<>();
		marks.add(0);
		marks.add(10);
		marks.add(501);
		marks.add(110);
		marks.add(21);
		marks.add(150);
		System.out.println(marks);
	 
		//sorting
		List<Integer> sortedMarks=marks.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedMarks);
		
		/*//descending order
		List<Integer> descendentSortedMarks=marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println(descendentSortedMarks);
		*/
		//default natural sorting
		/*List<Integer> descendentSortedMarks=marks.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());*/
		//or 
		List<Integer> descendentSortedMarks=marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(descendentSortedMarks);
	}
}
