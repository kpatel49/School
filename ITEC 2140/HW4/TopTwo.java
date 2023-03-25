package HW4;

import java.util.Scanner;

public class TopTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a sequence of integers: ");
		int max = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;
		int count = 1, count2 = 1;
		while (input.hasNextInt()) {
			int num = input.nextInt();
			if (num > max) {
				secmax = max;
				max = num;
			} else if (num == max) {
				count++;
			}
			if (num < max && num > secmax) {
				secmax = num;
			} else if (num == secmax) {
				count2++;
			}
		}
		System.out.printf("The highest is %d. Its number of occurrences is %d. \n", max, count);
		System.out.printf("The second highest is %d. Its number of occurrences is %d.", secmax, count2);
	}

}
