package Activity10;

import java.util.Scanner;

public class BinToDec {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the binary representation of a nonnegative integer:  ");
		String bin = input.nextLine();
		int dec = 0;
		for (int i = 0; i < bin.length(); i++) {
			char ch = bin.charAt(i);
			int bit = ch - '0';
			dec = 2 * dec + bit;
		}
		System.out.println("Its decimal representation is " + dec);
	}
}