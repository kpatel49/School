package HW5;

import java.util.Scanner;

public class CountLetterTest {

	/*
	 * The main method is a test driver for the countLetter() method of the Letter class
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		System.out.println(Letter.countLetters(s));

	}

}