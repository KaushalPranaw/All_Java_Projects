package test;


public class Tester {

	private int id;
	private static int id1;
	void a()
	{
		//int x=int a+3;
	}
	
	public Tester() {
		// TODO Auto-generated constructor stub
		id++;
		id1++;
	}
	public static void main(String[] args) {
		Tester t=new Tester();
		Tester t1=new Tester();
		Tester t2=new Tester();
		Tester t3=new Tester();
		System.out.println(id1);
	}
}
