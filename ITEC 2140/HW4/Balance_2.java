package HW4;

import java.util.Scanner;

public class Balance_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your monthly deposit amount: ");
		double amount = input.nextDouble();
		System.out.println("Enter the annual interest rate: ");
		double rate = input.nextDouble() / 100;
		System.out.println("Enter the number of months: ");
		int month = input.nextInt();
		double sum = 0;
		for (int i = 0; i < month; i++) {
			sum = (sum + amount) * (1 + (rate / 12));
			System.out.printf("Balance at the end of month %d is %.2f\n", i + 1, sum);
		}
	}

}
