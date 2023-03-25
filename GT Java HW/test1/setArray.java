package test1;

import java.util.*;

public class setArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int stopInput = 000;
		int number;

		System.out.print("Enter a number: ");
		number = input.nextInt();

		while (number != stopInput) {
			System.out.print("Enter a number: ");
			number = input.nextInt();
			int array[] = { number };
		}
		//System.out.print("Array size: " + array.length);
	} // Main brace
}