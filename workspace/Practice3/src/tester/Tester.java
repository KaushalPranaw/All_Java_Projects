package tester;
import inh.Student;
public class Tester {

	public static void main(String[] args) 
	{
		Student s1=new Student("a","b",2017);
		System.out.println(s1);//invokes implicitely s1.toString()
	}

}
