package singly;

public class Test {

	public static void main(String[] args) 
	{
		SinglyLinkList sl=new SinglyLinkList();
		sl.pushfront(10);
		sl.pushfront(20);
		sl.pushfront(30);
		sl.pushfront(40);
		sl.pushfront(50);
		sl.print();
		
		sl.pushEnd(60);
		sl.pushEnd(70);
		sl.pushEnd(80);
		sl.print();
		
		sl.pushMiddle(sl.head.next, 5);
		sl.print();
	}
}
