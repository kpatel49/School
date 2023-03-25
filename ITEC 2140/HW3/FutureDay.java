package HW3;

import java.util.Scanner;

public class FutureDay {

	public static void main(String[] arg) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the current day of the week: ");
		String day = input.next().toLowerCase();
		int num;
		switch (day) {
		case "monday":
			num = 1;
			break;
		case "tuseday":
			num = 2;
			break;
		case "wednesday":
			num = 3;
			break;
		case "thursday":
			num = 4;
			break;
		case "friday":
			num = 5;
			break;
		case "saturday":
			num = 6;
			break;
		case "sunday":
			num = 0;
			break;
		default:
			System.out.println("Invalid Input");
			return;
		}
		System.out.println("Enter the number of elapsing days: ");
		int elapsing = input.nextInt();
		int FD = (num + elapsing % 7);
		if (FD == 1) {
			System.out.printf("After %d days the future day will be Monday", elapsing);
		} else if (FD == 2) {
			System.out.printf("After %d days the future day will be Tuesday", elapsing);
		} else if (FD == 3) {
			System.out.printf("After %d days the future day will be Wednesday", elapsing);
		} else if (FD == 4) {
			System.out.printf("After %d days the future day will be Thursday", elapsing);
		} else if (FD == 5) {
			System.out.printf("After %d days the future day will be Friday", elapsing);
		} else if (FD == 6) {
			System.out.printf("After %d days the future day will be Saturday", elapsing);
		} else if (FD == 0) {
			System.out.printf("After %d days the future day will be Sunday", elapsing);
		}
		return;
	}
}
