package HW2;

import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your monthly deposit amount: ");
		double amount = input.nextDouble();
		System.out.println("Enter the annual interest rate: ");
		double rate = input.nextDouble() / 100;
		double v1 = amount * (1 + (rate / 12));
		System.out.printf("Balance at the end of month 1 is %.2f\n", v1);
		double v2 = (v1+amount) * (1 + (rate / 12));
		System.out.printf("Balance at the end of month 2 is %.2f\n", v2);
		double v3 = (v2+amount) * (1 + (rate / 12));
		System.out.printf("Balance at the end of month 3 is %.2f\n", v3);
		double v4 = (v3+amount) * (1 + (rate / 12));
		System.out.printf("Balance at the end of month 4 is %.2f\n", v4);
		double v5 = (v4+amount) * (1 + (rate / 12));
		System.out.printf("Balance at the end of month 5 is %.2f\n", v5);
		double v6 = (v5+amount) * (1 + (rate / 12));
		System.out.printf("Balance at the end of month 6 is %.2f\n", v6);

	}

}
