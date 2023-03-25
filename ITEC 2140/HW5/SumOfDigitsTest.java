package HW5;

import java.util.Scanner;

public class SumOfDigitsTest {

	/*
	 * The main method is a test driver for the sumDigits() method of the SumOfDigits class
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		System.out.println(SumOfDigits.sumDigits(n));
	}

}

