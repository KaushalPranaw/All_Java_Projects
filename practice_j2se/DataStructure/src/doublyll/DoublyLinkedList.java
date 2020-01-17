package doublyll;

public class DoublyLinkedList {

	Node head;

	static class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			next = null;
			prev = null;
		}
	}
}
