package HW4;

import java.util.Scanner;

public class BinToDec {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the binary representation of a nonnegative integer:  ");
		String binaryString = input.nextLine();
		int dec = Integer.parseInt(binaryString, 2);
		System.out.println("Its decimal representation is " + dec);
	}
}