package doublyll;

import doublyll.DoublyLinkedList.Node;

public class CollectionUtils {

	// --------------------------DISPLAY-----------------------------------

	static void display(DoublyLinkedList dll) {
		if (dll.head == null) {
			System.out.println("list is empty");
		} else {
			Node tmp = dll.head;
			System.out.print("[ ");
			while (tmp != null) {
				System.out.print(tmp.data + " ");
				tmp = tmp.next;
			}
			System.out.print("]");
			System.out.println();
		}
	}

	// --------------------------INSERT-----------------------------------

	static void insertFront(DoublyLinkedList dll, int data) {
		Node newNode = new Node(data);
		if (dll.head == null) {
			dll.head = newNode;
			newNode = dll.head;
		} else {
			newNode.next = dll.head;
			dll.head.prev = newNode;
			dll.head = newNode;
		}
		System.out.println("inserted front");
	}

	static void insertLast(DoublyLinkedList dll, int data) {
		Node newNode = new Node(data);

		if (dll.head == null) {
			dll.head = newNode;
			newNode = dll.head;
		} else {
			Node tmp = dll.head;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			newNode.prev = tmp.next;
			tmp.next = newNode;
		}
		System.out.println("inserted last");
	}

	static void insertAtPos(DoublyLinkedList dll, int data, int pos) {

		if (pos == 0) {
			System.out.println("pos should be greater than 0");
		} else if (pos == 1) {
			insertFront(dll, data);
		} else {
			Node newNode = new Node(data);
			Node temp = dll.head;
			for (int i = 0; i < pos - 2; i++) {
				temp = temp.next;
			}
			if (temp != null) {
				newNode.next = temp.next;
				newNode.prev = temp;
				temp.next = newNode;
				if (temp.next != null) {
					temp.next.prev = newNode;
				}
				System.out.println("inserted last");
			} else {
				System.out.println("pos out from range");
			}

		}
	}

	static void insertSorted(DoublyLinkedList dll, int data) {
		Node newNode = new Node(data);
		if (dll.head == null) {
			dll.head = newNode;
			newNode = dll.head;
		} else {
			if (data < dll.head.data) {
				insertFront(dll, data);
			} else {

				Node temp = dll.head;

				while (data < temp.data && temp != null) {
					temp = temp.next;
				}
				newNode.next = temp.next;
				newNode.prev = temp;
				temp.next = newNode;
				if (temp.next != null) {
					temp.next.prev = newNode;
				}

			}
		}
	}

	// --------------------------DELETE-----------------------------------
	static void deleteFirst(DoublyLinkedList dll) {
		if (dll.head == null) {
			System.out.println("list is empty");
		} else {
			dll.head = dll.head.next;
			System.out.println("deleted from front");
		}
	}

	static void deleteLast(DoublyLinkedList dll) {
		if (dll.head == null) {
			System.out.println("list is empty");
		} else if (dll.head.next == null) {
			dll.head = null;
			System.out.println("deleted last");
		} else {
			Node temp = dll.head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
			System.out.println("deleted last");
		}
	}

	static void deleteAtPos(DoublyLinkedList dll, int pos) {
		if (dll.head == null) {
			System.out.println("list is empty");
		} else {
			if (pos == 0) {
				System.out.println("pos should be greater than 0");
			} else if (pos == 1) {
				deleteFirst(dll);
			} else {
				Node temp = dll.head;
				for (int i = 0; i < pos - 2; i++) {
					if (temp != null)
						temp = temp.next;
				}
				if (temp != null) {

					if (temp.next == null) {
						temp.prev.next = null;
					}
					temp.next = temp.next.next;

					System.out.println("deleted");
				} else {
					System.out.println("pos out from range");
				}

			}
		}
	}
}
