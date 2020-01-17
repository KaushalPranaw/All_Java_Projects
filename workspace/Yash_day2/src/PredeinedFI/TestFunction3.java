package PredeinedFI; 
import java.util.function.*;
 
class Student
{
	String name;
	int marks;
	public Student(String name, int marks) {
		 
		this.name = name;
		this.marks = marks;
	}
	
}
 
public class TestFunction3 {
	 
	public static void main(String[] args) {
		 
		Student[] stud= {new Student("a", 40),
							new Student("b", 99),
							new Student("d", 75)};
		
		  Function<Student, String> f=s->{
			  int marks=s.marks;
			  String grade;
			  if(marks>80)
				  grade="A";
			  else if(marks>=70)
				  grade="B";
			  else
				  grade="C";
			  return grade;
		  };
		  for(Student s:stud)
		  {
			  		
				  System.out.println(f.apply(s));
		  }
		 
		
	}

}
