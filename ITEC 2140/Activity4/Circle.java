package Activity4;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the radius of a circle: ");
		double radius = number.nextDouble();
		if (radius < 0) {
			System.out.println("Invalid input: the radius cannot be negative");
		} else {
			double area = Math.PI * (radius * radius);
			double perimeter = Math.PI * 2 * radius;
			System.out.printf("A circle of radius %.2f has area %.2f and perimeter %.2f", radius, area, perimeter);
		}

	}

}
