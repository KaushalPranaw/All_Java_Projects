package circularll;

import circularll.CircularLL.Node;

public class CollectionUtils {

	// -------------------------display---------------------------

	public static void display(CircularLL cll) {
		Node tmp = cll.last;
		if (tmp == null) {
			System.out.println("list is empty");
		} else {
			do {
				System.out.print(tmp.next.data + " ");
				tmp = tmp.next;
			} while (tmp != cll.last);
			System.out.println();
		}

	}

	// ---------------------------insert---------------------------

	public static void insertBegin(int data, CircularLL cll) {
		Node newNode = new Node(data);

		if (cll.last == null) {
			cll.last = newNode;
			cll.last.next = cll.last;
			System.out.println("inserted");
		} else {
			newNode.next = cll.last.next;
			cll.last.next = newNode;
			System.out.println("inserted!");
		}
	}

	public static void insertEnd(int data, CircularLL cll) {

		if (cll.last == null)
			insertBegin(data, cll);
		else {
			Node newNode = new Node(data);
			newNode.next = cll.last.next;
			cll.last.next = newNode;
			cll.last = newNode;
			System.out.println("inserted at end!");
		}
	}

	public static void insertAfter(int data, int item, CircularLL cll) {
		if (cll.last == null) {
			insertBegin(data, cll);
		} else {
			Node newNode = new Node(data);
			Node tmp = cll.last.next;
			do {
				if (tmp.data == item) {
					newNode.next = tmp.next;
					tmp.next = newNode;
					if (tmp == cll.last)
						cll.last = newNode;
				}
				tmp = tmp.next;
			} while (tmp != cll.last.next);
		}
	}

	// -----------------------------DELETE----------------------------------
	public static void deleteKey(int key, CircularLL cll) {

		if (cll.last == null) {
			System.out.println("list is empty");
		} else {
			Node cur = cll.last.next, prev = null;
			while (cur.data != key) {
				if (cur == cll.last) {
					System.out.printf("Not Found");
					break;
				}

				prev = cur;
				cur = cur.next;
			}
			if (cur == cll.last) {
				cll.last = null;

				System.out.println("deleted");
			} else {
				prev.next = cur.next;
				System.out.println("deleted........");
			}

		}

	}

}
