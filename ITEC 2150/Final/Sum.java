package Final;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean iterate = true;
		do {
			try {
				System.out.println("Enter two integers.");
				int x = input.nextInt();
				int y = input.nextInt();
				System.out.println(x + " + " + y + " = " + (x + y));
				iterate = false;
			} catch (InputMismatchException e) {
				System.out.println(e + " Try again.");
				input.nextLine();
			}
		} while (iterate);

	}
}
