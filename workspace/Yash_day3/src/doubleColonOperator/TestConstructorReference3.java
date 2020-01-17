package doubleColonOperator;


class Student
{
	 String name;
	 int rollno;
	 int marks;
	 int age;
	public Student(String name, int rollno, int marks, int age) {
		 
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
		this.age = age;
	}
	 
}

interface I
{
	public Student get(String name,int rollno,int marks,int age);
}


class Demo implements I
{
	public Student get(String name,int rollno,int marks,int age)
	{
		Student s=new Student(name, rollno, marks, age);
		return s;
	}
}

public class TestConstructorReference3 {

	public static void main(String[] args) {
		I i=(name,rollno,marks,age)-> new Student(name, rollno, marks, age);
		
		//using constructor ref
		
		I i1=Student::new;
		
	}
	
}
