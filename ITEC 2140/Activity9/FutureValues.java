package Activity9;

import java.util.Scanner;

public class FutureValues {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the present value: ");
		double amount = input.nextDouble();
		System.out.println("Enter the annual interest rate: ");
		double rate = input.nextDouble() / 100;
		System.out.println("Enter the number of months: ");
		int month = input.nextInt();
		for (int i = 0; i < month; i++) {
			double v1 = amount * Math.pow((1 + (rate / 12)), i + 1);

			if (i + 1 == 1) {
				System.out.printf("The future value after %d month is %.2f\n", i + 1, v1);
			} else {
				System.out.printf("The future value after %d months is %.2f\n", i + 1, v1);
			}
		}
	}

}
