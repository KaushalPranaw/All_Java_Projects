package singlyll;

import java.util.Scanner;

import static singlyll.CollectionUtils.*;


public class TestSingly {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		while (!exit) {
			System.out.println("Enter \n" + "1. Insert begin\n" + "2. Insert at end\n" + "3. Insert at given position\n"
					+ "4. delete first\n" + "5. delete last\n" + "6. delete at given pos \n" + "7. Display\n"
							+ "8. Insert sorted\n"
					+ "20. For exit");

			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter data");
				insertFront(sc.nextInt(), ll);
				break;
			case 2:
				System.out.println("Enter data");
				insertLast(sc.nextInt(),ll);
				break;
			case 3:
				System.out.println("Enter data and pos");
				insertAtPos(sc.nextInt(),sc.nextInt(),ll);
				break;
			case 4:
				deleteFirst(ll);
				break;
			case 5:
				deleteLast(ll);
				break;
			case 6:
				System.out.println("enter pos");
				deleteAtPos(ll, sc.nextInt());
				break;
			case 7:
				printList(ll);

				break;
				
			case 8:
				System.out.println("Enter element");
				insertSorted(ll,sc.nextInt());
				break;
			case 20:
				exit = true;
				System.out.println("Exiting............");
				break;

			default:
				System.out.println("Wrong choice please try again");
				break;
			}
		}
		
		if(sc!=null)
			sc.close();

	}
}
