package HW2;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		int fn = number % 10;
		number /= 10;
		int sn = number % 10;
		number /= 10;
		int tn = number % 10;
		number /= 10;
		int sum = fn + sn + tn;
		System.out.println("The sum of the digits is " + sum);
	}

}
