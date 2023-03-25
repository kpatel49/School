package HW3;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double discriminant = Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5);

		if (discriminant > 0) {
			double ans1 = ((b * (-1)) + discriminant) / (2 * a);
			double ans2 = ((b * (-1)) - discriminant) / (2 * a);

			System.out.printf("The equation has two roots %.1f and %.1f", ans1, ans2);

		} else if (discriminant == 0) {
			double ans = ((b * (-1)) + discriminant ) / (2 * a);
			System.out.println("The equation has one root " + ans);
		} else {
			System.out.println("The equation has no real roots");
		}

	}
}