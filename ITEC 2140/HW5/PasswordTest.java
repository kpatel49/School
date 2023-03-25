package HW5;

import java.util.Scanner;

public class PasswordTest {

	/*
	 * The main method is a test driver for the isValid() method of the Password class
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String password = input.nextLine();
		System.out.println(Password.isValid(password));
	}

}