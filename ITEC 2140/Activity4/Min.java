package Activity4;

import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		int x = number.nextInt();
		int y = number.nextInt();
		if (x < y) {
			System.out.println("The minimum of " + x + " and " + y + " is " + x);
		} else {
			System.out.println("The minimum of " + x + " and " + y + " is " + y);
		}

	}

}
