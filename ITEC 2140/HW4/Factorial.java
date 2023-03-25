package HW4;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a nonnegative integer: ");
		int num = input.nextInt();
		int factorial = 1;
		while (num < 0) {
			System.out.println("Invalid input. Enter a nonnegative integer: ");
			num = input.nextInt();
		}
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.printf("%d! = %d", num, factorial);

	}

}
