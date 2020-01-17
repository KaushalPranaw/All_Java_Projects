package tester;

public class Test {
	public int a = 0;

	class innerClass {
		public int a = 1;

		void innermethod(int x)
		{
			System.out.println("value of x = " + x);
			System.out.println("value of this.x = " + this.a);
			System.out.println("value of Test.this.x = " + Test.this.a);
		}
	}

	public static void main(String args[]) {
		Test t = new Test();
		Test.innerClass im = t.new innerClass();
		im.innermethod(55);
	}
}