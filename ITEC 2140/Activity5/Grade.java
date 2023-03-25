package Activity5;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a numeric grade: ");
		int grade = input.nextInt();
		if (grade >= 90) {
			System.out.println("The letter grade is A");
		} else if (grade >= 80) {
			System.out.println("The letter grade is B");
		} else if (grade >= 70) {
			System.out.println("The letter grade is C");
		} else if (grade >= 60) {
			System.out.println("The letter grade is D");
		} else {
			System.out.println("The letter grade is F");
		}

	}

}
