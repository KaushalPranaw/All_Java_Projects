package yash_day2;

class Student
{
	int id;
	String name;
	void display()
	{
		System.out.println(id+" "+name);
	}
}

public class TestObject {

	public static void main(String[] args) {
		
		/*//1
		Student student=new Student();
		student.display();*/
		
		
		/*//2
		try {
			Student student=(Student)Class.forName("yash_day2.Student").newInstance();
			student.display();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		Student s=new Student();
		s=null;
		System.out.println(s instanceof Student);
	}
	
}
