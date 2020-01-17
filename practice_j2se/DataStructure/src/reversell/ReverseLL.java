package reversell;


public class ReverseLL {

	Node head;

	static class Node {
		int d;
		Node next;

		public Node(int data) {
			d = data;
			next = null;
		}

	}

	Node reverseLL(ReverseLL ll) {
		Node prev = null;
		Node cur = ll.head;
		Node next = null;

		while (cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		ll.head = prev;
		return ll.head;
	}

	public static void main(String[] args) {
		ReverseLL list = new ReverseLL();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);
		Node tmp=list.head;
		while(tmp!=null)
		{
			System.out.print(tmp.d+" ");
			tmp=tmp.next;
		}
		list.head = list.reverseLL(list);
		System.out.println();
		 tmp=list.head;
		while(tmp!=null)
		{
			System.out.print(tmp.d+" ");
			tmp=tmp.next;
		}
	}
}
