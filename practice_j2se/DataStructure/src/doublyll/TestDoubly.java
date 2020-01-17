package doublyll;

import java.util.Scanner;
import static doublyll.CollectionUtils.*;

public class TestDoubly {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			DoublyLinkedList dll = new DoublyLinkedList();
			boolean exit = false;
			while (!exit) {
				System.out.println("Enter \n" + "1. Insert begin\n" + "2. Insert last\n" + "3. Insert at Pos\n"
						+ "4. Insert sorted\n" + "5. Delete first\n" + "6. Delete last\n" + "7. Delete at Pos\n"
						+ "8. Display\n" + "10. exit");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("insert num");
					insertFront(dll, sc.nextInt());
					break;
				case 2:
					System.out.println("insert num");
					insertLast(dll, sc.nextInt());
					break;
				case 3:
					System.out.println("insert num and pos");
					insertAtPos(dll, sc.nextInt(), sc.nextInt());
					break;
				case 4:
					System.out.println("insert num");
					insertSorted(dll, sc.nextInt());
					break;
				case 5:
					deleteFirst(dll);
					break;
				case 6:
					deleteLast(dll);
					break;
				case 7:
					System.out.println("insert pos");
					deleteAtPos(dll, sc.nextInt());
					break;
				case 8:
					display(dll);
					break;
				case 10:
					exit = true;
					System.out.println("exiting.......");
					break;

				default:
					System.out.println("wrong choice please try again");
					break;
				}
			}
			System.out.println();
		}
	}
}
