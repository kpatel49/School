package HW3;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length and width of a rectangle: ");
		int length = input.nextInt();
		int width = input.nextInt();
		if (length <= 0 || width <= 0) {
			System.out.println("Invalid Input: Both length and width must be positive ");
		} else {
			double area = length * width;
			double perimeter = ((length * 2) + (width * 2));
			System.out.printf("The area of your rectangle is %.1f. Its perimeter is %.1f.", area, perimeter);
		}
	}

}
