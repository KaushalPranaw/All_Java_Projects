package stream;

import java.util.ArrayList; 

public class TestStream3_Map {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<>();
		marks.add(0);
		marks.add(10);
		marks.add(501);
		marks.add(110);
		marks.add(21);
		marks.add(150);
		System.out.println(marks);
	 
		long noOfFailedStudents=marks.stream().filter(i->i>100).count();
		System.out.println(noOfFailedStudents);
	}
}
