package doublycircularll;

import java.util.Scanner;

public class TestDoublyCircular {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			DoublyCircularLL dcll = new DoublyCircularLL();
			boolean exit = false;
			while (!exit) {
				System.out.println("Enter \n" + "1. Insert begin\n" + "2. Insert last\n" + "3. Insert at Pos\n"
						+ "4. Insert sorted\n" + "5. Delete first\n" + "6. Delete last\n" + "7. Delete at Pos\n"
						+ "8. Display\n" + "10. exit");
				switch (sc.nextInt()) {
				case 1:
					
					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				case 5:

					break;
				case 6:

					break;
				case 7:

					break;
				case 8:

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
