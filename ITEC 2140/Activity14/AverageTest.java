package Activity14;

import java.util.*;

public class AverageTest {

	/*
	 * The main method is a test driver for the average() method of the MyArray class
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double[] A = new double[n];
		for (int i = 0; i < n; i++) {
			A[i] = input.nextDouble();
		}
		System.out.println(MyArray.average(A));

	}

}
