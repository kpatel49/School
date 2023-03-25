package Activity9;

import java.util.Scanner;

public class CountChars {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = input.nextLine();
		int upper = 0, lower = 0, num = 0, other = 0, space = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upper++;
			} else if (ch >= 'a' && ch <= 'z') {
				lower++;
			} else if (ch >= '0' && ch <= '9') {
				num++;
			} else if (ch <= ' ') {
				space++;
			} else {
				other++;
			}
		}
		System.out.println("The input string has ");
		if (upper > 1) {
			System.out.println(upper + " upper-case letters");
		}else {
			System.out.println(upper + " upper-case letter");
		}
		if (lower > 1) {
			System.out.println(lower + " lower-case letters");
		}else {
			System.out.println(lower + " lower-case letter");
		}		
		if (num > 1) {
			System.out.println(num + " digits");
		}else {
			System.out.println(num + " digit");
		}
		if (space > 1) {
			System.out.println(space + " white spaces");
		}else {
			System.out.println(space + " white space");
		}
		if (other > 1) {
			System.out.println(other + " other characters");
		}else {
			System.out.println(other + " other character");
		}
	}
}
