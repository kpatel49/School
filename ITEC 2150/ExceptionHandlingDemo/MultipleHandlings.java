package ExceptionHandlingDemo;

import java.util.InputMismatchException;

public class MultipleHandlings {
	public static void main(String[] args) {
		method();
	}

	public static void method() {
		java.util.Scanner input = new java.util.Scanner(System.in);
		boolean x = false;
		String s = "";
		try {
			System.out.println("Enter a string value");
			s = input.nextLine();
			System.out.println(s);
		} catch (InputMismatchException e) {
			System.out.println(e + " this is InputMismatchException");

		}
		while(!x) {
		try {
			System.out.println("What is the last index number of the string you just entered. ");
			int index = input.nextInt();
			System.out.println(s.charAt(index));
			if(index <= s.length()) {
				x = true;
			}
			else {
			x = false;
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e + " this is IndexOutOfBoundsException");
			System.out.println("Please try again");
		}
		}

		try {
			System.out.println("Enter an integer value");
			int number = input.nextInt();
			System.out.println(number * 8);
		}

		catch (RuntimeException e) {
			System.out.println(e + " this is RuntimeException");
		} catch (Exception e) {
			System.out.println(e + " this is Exception");
		}

	}
}
