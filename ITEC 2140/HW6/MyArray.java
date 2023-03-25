package HW6;

import java.util.*;

public class MyArray {

	public static double[] stats(double[] A) {
		double sum = 0, std = 0;
		double a[] = new double[2];
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
		}
		a[0] = sum / A.length;
		for (int i = 0; i < A.length; i++) {
			std += Math.pow((A[i] - a[0]), 2);
		}
		a[1] = Math.sqrt(std / A.length);
		return a;
	}

	public static int[] indexAndCountOfMax(double[] A) {
		double max = A[0];
		int index = 0, count = 0;
		int a[] = new int[2];
		for (int i = 1; i < A.length; i++) {
			if (A[i] > max) {
				max = A[i];
				index = i;
			}
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] == max) {
				count++;
			}
			a[0] = index;
			a[1] = count;
		}
		return a;
	}

	public static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void shiftRight(int[] A) {
		int last = A[A.length -1];
			for (int i = A.length -1; i > 0; i--) {
			A[i] = A[i - 1];
		}
		A[0] = last ;
	}

	public static char[] initRandomLetter(int n) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		Random random = new Random(2140);
		char[] ch = new char[n];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(random.nextInt(str.length()));
		}
		return ch;
	}

	public static long[] fibonacci(int n) {
		long[] sum = new long[n];
		sum[0] = 0;
		sum[1] = 1;
		for (int i = 2; i < sum.length; i++) {
			sum[i] = sum[i - 1] + sum[i - 2];
		}
		return sum;
	}

}
