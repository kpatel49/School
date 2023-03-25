package HW4;

import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a nonnegative integer in the decimal representation: ");
		int dec = input.nextInt();
		String bin = Integer.toBinaryString(dec);
		System.out.println("Its binary representation is " + bin);

	}

}
