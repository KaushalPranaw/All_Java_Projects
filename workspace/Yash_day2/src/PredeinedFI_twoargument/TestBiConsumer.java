package PredeinedFI_twoargument;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Student
{
	String name;
	double salary;
	public Student(String name,double salary) {
		this.name = name;
		this.salary=salary;
	}
	
}

public class TestBiConsumer {

	public static void main(String[] args) {
		  
		ArrayList<Student> a=new ArrayList<>();
		populate(a);
		BiConsumer<Student, Double> bc=(e,d)->e.salary=e.salary+d;
		for(Student s:a)
		{
			bc.accept(s, 5.0);
		}
		a.forEach((b)-> System.out.println(b.salary));
		 
	}
	public static void populate(ArrayList<Student> a)
	{
		a.add(new Student("a", 1000));
		a.add(new Student("aaaaa", 12000));
		a.add(new Student("accccc", 13000));
		a.add(new Student("dddddddda", 111000));
	}
}
