package Activity3;

import java.util.Scanner;

public class CoinChange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of money in cents: ");
		int amount = input.nextInt();
		if (amount <= 0) {
			System.out.println("Invalid Input: The amount must be positive ");
		} else {
			int RemainingAmount = amount;
			int numberofQuarters = RemainingAmount / 25;
			RemainingAmount = RemainingAmount % 25;
			int numberofDimes = RemainingAmount / 10;
			RemainingAmount = RemainingAmount % 10;
			int numberofNickels = RemainingAmount / 5;
			RemainingAmount = RemainingAmount % 5;
			int numberofPennies = RemainingAmount;
			System.out.println("Here is the optimal way to change " + amount + " cents: ");
			if (numberofQuarters > 0) {
				if (numberofQuarters > 1) {
					System.out.println(numberofQuarters + " quarters");
				} else if (numberofQuarters > 0 && numberofQuarters <= 1) {
					System.out.println(numberofQuarters + " quarter");
				}
			} else {
				System.out.println(numberofDimes + " dimes");
			}
			if (numberofDimes > 0) {
				if (numberofDimes > 1) {
					System.out.println(numberofDimes + " dimes");
				} else if (numberofDimes > 0 && numberofDimes <= 1) {
					System.out.println(numberofDimes + " dime");
				}
			}
			if (numberofNickels > 0) {
				if (numberofNickels > 1) {
					System.out.println(numberofNickels + " nickels");
				} else if (numberofNickels > 0 && numberofNickels <= 1) {
					System.out.println(numberofNickels + " nickel");
				}
			}
			if (numberofPennies > 0) {
				if (numberofPennies > 1) {
					System.out.println(numberofPennies + " pennies");
				} else if (numberofPennies > 0 && numberofPennies <= 1) {
					System.out.println(numberofPennies + " penny");
				}
			}
		}

	}
}
