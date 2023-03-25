package FinalTest;

import java.util.*;

public class IntersectionTest {

	/*
	 * The main method is a test driver for the method intersection() 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = input.nextInt();
		}
		
		int m = input.nextInt();
		int[] B = new int[m];
		for (int i = 0; i < m; i++) {
			B[i] = input.nextInt();
		}
		
		System.out.println(Intersection.intersection(A, B));
	}

}
