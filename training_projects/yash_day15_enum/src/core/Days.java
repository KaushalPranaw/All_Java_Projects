package core;

public enum Days implements A  {

	SUN(10), MON, TUES, THURS, FRI, SAT;

	int val;
	@Override
	public void b() {
		System.out.println("interface nethod b()");
		
	}

	private Days() {
		// TODO Auto-generated constructor stub
	}

	private Days(int i) {
		// TODO Auto-generated constructor stub
		this.val=i;
	}
	
	static void a() {
		System.out.println("a()");
	}

	int getVal()
	{
		return this.val;
	}
	public static void main(String[] args) {
		Days.FRI.b();
		Days.a();
	//	System.out.println(Days.valueOf("a"));
		for(Days d: Days.values())
			System.out.println(d.ordinal()+" "+d.getVal());
	}
}
