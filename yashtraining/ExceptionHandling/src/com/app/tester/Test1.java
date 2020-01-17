package com.app.tester;

class Test1 {
	//static final int i;
	/*static
	{
		i=6;
	}*/
	public Test1() {
		//i=10;
		//i=5;
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		final Test1 t=new Test1();
		final int i;
		int j=5;
		if(j>6)
			i=5;
		//System.out.println(i);
		Test1 t1=new Test1();
		System.out.println(t+" "+t1);
	}
}