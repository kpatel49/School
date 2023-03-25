package HW4;

import java.util.Scanner;

public class Stats {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a sequence of numbers: ");
		double sum = 0, mean = 0, sd = 0, sum2 = 0;
		int count = 0;
		double v = 0;
		double x = 0;
		int num = 0;
		while (input.hasNextDouble()) {
			num = input.nextInt();
			sum = sum + num;
			sum2 += Math.pow(num, 2);
			count++;
		}
		mean = sum / count;
		sd = Math.sqrt((sum2 / count) - Math.pow(mean, 2));
		System.out.printf("The mean is %.1f\n", mean);
		System.out.printf("The standard deviation is %.1f", sd);
	}

} 