package Activity13;

import java.util.*;

public class MyArray6 {

	public static int[] initFromScanner(int n, Scanner input) {
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = input.nextInt();
		}
		return A;
	}

	public static double[] randomInit(int n, double start, double end) {
		double[] A = new double[n];
		Random random = new Random(2140);
		for (int i = 0; i < n; i++) {
			double bound = end - start;
			double x = bound * random.nextDouble();
			A[i] = x + start;
		}
		return A;
	}

	public static int[] randomInit(int n, int start, int end) {
		int[] A = new int[n];
		Random random = new Random(2140);
		for (int i = 0; i < n; i++) {
			A[i] = random.nextInt(end - start) + start;
		}
		return A;
	}

	public static int[] initialize(int n) {
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = i;
		}
		return A;
	}

}
