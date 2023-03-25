package Activity15;

import java.util.*;

public class Copy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int[] A = new int[n];
		for (int k = 0; k < n; k++) {
			A[k] = input.nextInt();
		}
		int[] B = new int[n];
		
		// Copy the values of A to B
		// Your code starts
		
		for (int i = 0; i < n; i++) {
			B[i] = A[i];
		}		
		
		// Your code ends
		
		System.out.println("\nAfter the values of A are copied to B");
		System.out.println("A: " + Arrays.toString(A));
		System.out.println("B: " + Arrays.toString(B));
		
		A[0] *= -100;
		B[1] *= -100;
		
		System.out.println("\nAfter updates to A and B");
		System.out.println("A: " + Arrays.toString(A));
		System.out.println("B: " + Arrays.toString(B));

	}

}
