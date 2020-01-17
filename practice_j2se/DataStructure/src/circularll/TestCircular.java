package circularll;

import java.util.Scanner;
import static circularll.CollectionUtils.*;

public class TestCircular {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			CircularLL cll = new CircularLL();
			boolean exit = false;
			while (!exit) {
				System.out.println("Enter \n" + "1. Insert begin\n" + "2. Insert last\n" + "3. Insert after item\n"
						+ "4. Delete key\n" + "5. Display\n" + "10. exit");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter data");
					insertBegin(sc.nextInt(), cll);
					break;
				case 2:
					System.out.println("Enter data");
					insertEnd(sc.nextInt(), cll);
					break;
				case 3:
					System.out.println("Enter data and item");
					insertAfter(sc.nextInt(), sc.nextInt(), cll);
					break;
				case 4:
					System.out.println("Enter key");
					deleteKey(sc.nextInt(), cll);
					break;
				case 5:
					display(cll);
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
