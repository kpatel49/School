package HW5;

import java.util.Scanner;

public class PalindromicPrimeTest {

	/*
	 * The main method is a test driver for the generatePalindromicPrimes() method
	 * of the Number class
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		Number.generatePalindromicPrimes(x);

	}

}
