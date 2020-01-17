package tester;

class Test11<T extends Number> {

}

public class Test1 {
	public static void main(String[] args) {
		Test11<Integer> t=new Test11<>();
		Test11<Number> t1=new Test11<>();
		/*Test11<String> t=new Test11<>();*///bcz String does not come under NUumber
	}
}
