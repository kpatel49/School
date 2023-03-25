package Activity10;

import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a nonnegative integer in the decimal representation: ");
		int dec = input.nextInt();
		String bin = new String();

		while (dec > 0) {
			int bit = dec % 2;
			bin = bit + bin;
			dec = dec / 2;
		}
		System.out.println("Its binary representation is " + bin);

	}

}