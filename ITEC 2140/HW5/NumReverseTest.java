package HW5;

import java.util.*;

public class NumReverseTest {

	/*
	 * The main method is a test driver for the reverse() and isPalindrome() methods of the Number class
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println(Number.reverse(num));
		System.out.println(Number.isPalindrome(num));
	}

}
