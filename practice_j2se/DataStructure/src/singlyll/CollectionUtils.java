package singlyll;

import singlyll.LinkedList.Node;

public class CollectionUtils {

	// ---------------------------PRINT-----------------------------------

	static void printList(LinkedList ll) {
		// LinkedList ll=new LinkedList();
		if (ll.head == null) {
			System.out.println("list is empty");
		} else {
			Node tmp = ll.head;
			while (tmp != null) {
				System.out.print(tmp.data + " ");
				tmp = tmp.next;
			}
			System.out.println();
		}

	}

	// ---------------------------INSERT-----------------------------------

	static void insertFront(int data, LinkedList ll) {
		Node newNode = new Node(data);
		newNode.next = ll.head;
		ll.head = newNode;
		System.out.println("inserted at first.......");
	}

	static void insertLast(int data, LinkedList ll) {
		Node newNode = new Node(data);

		Node tmp = ll.head;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = newNode;
		//newNode.next = null;
		System.out.println("inserted at end.......");
	}

	static void insertAtPos(int data, int pos, LinkedList ll) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (ll.head == null) {
			ll.head = newNode;
			newNode = ll.head;
			System.out.println("inserted");
		} else {
			if (pos == 0) {
				System.out.println("Wrong Position, should be greater than 0");
			} else if (pos == 1)
				insertFront(data, ll);
			else if (pos == 2) {
				newNode.next = ll.head.next;
				ll.head.next = newNode;

				System.out.println("inserted");
			} else {
				Node tmp = ll.head;
				for (int i = 0; i < pos - 2; i++) {
					tmp = tmp.next;
				}
				if (tmp != null) {
					newNode.next = tmp.next;
					tmp.next = newNode;
					System.out.println("inserted");
				} else {
					System.out.println("pos out from range");
				}

			}
		}

	}

	static void insertSorted(LinkedList ll, int data) {
		Node newNode = new Node(data);

		if (ll.head == null) {
			ll.head = newNode;
			newNode = ll.head;
			System.out.println("inserted sorted");
		} else {
			Node tmp = ll.head, prev = null;
			if (tmp.data > data) {
				newNode.next = tmp;
				tmp = newNode;
				System.out.println("inserted sorted");
			} else {

				while (tmp != null && tmp.data < data) {
					prev = tmp;
					tmp = tmp.next;
				}
				newNode.next = prev.next;
				prev.next = newNode;

				System.out.println("inserted sorted");
			}

		}

	}

	// ---------------------------DELETE-----------------------------------
	static void deleteFirst(LinkedList ll) {
		if (ll.head != null) {
			ll.head = ll.head.next;
			System.out.println("deleted first element");
		} else {
			System.out.println("List is empty");
		}
	}

	static void deleteLast(LinkedList ll) {
		Node tmp = ll.head;
		if (tmp != null) {
			if (tmp.next != null) {
				while (tmp.next.next != null) {
					tmp = tmp.next;
				}
				tmp.next = null;
				System.out.println("deleted last");
			} else {
				deleteFirst(ll);
			}
		} else {
			System.out.println("List is empty");
		}
	}

	static void deleteAtPos(LinkedList ll, int pos) {
		if (ll.head == null) {
			System.out.println("List is empty");
		} else {
			if (pos == 0) {
				System.out.println("pos should be greater than 0");
			} else if (pos == 1) {
				deleteFirst(ll);
			} else if (pos == 2) {
				ll.head.next = ll.head.next.next;
				System.out.println("deleted");
			} else {
				Node tmp = ll.head;
				for (int i = 0; i < pos - 2; i++) {
					tmp = tmp.next;
				}
				if (tmp != null) {
					tmp.next = tmp.next.next;
					System.out.println("deleted");
				} else {
					System.out.println("pos out from range");
				}

			}
		}

	}

	// --------------------------------------------------------------------------

}
