package HW3;

import java.util.Scanner;

public class CostOfShipping {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the weight of your package: ");
		int w = input.nextInt();
		if (w <= 0) {
			System.out.println("Invalid Input: The weight must be positive ");
		} else if (w > 0 && w <= 1) {
			System.out.println("The cost for shipping your package is $3.5 ");
		} else if (w > 1 && w <= 3) {
			System.out.println("The cost for shipping your package is $5.5 ");
		} else if (w > 3 && w <= 10) {
			System.out.println("The cost for shipping your package is $8.5 ");
		} else if (w > 10 && w <= 20) {
			System.out.println("The cost for shipping your package is $10.5 ");
		} else {
			System.out.println("The package cannot be shipped");
		}
	}

}
