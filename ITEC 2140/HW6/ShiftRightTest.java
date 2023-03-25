package HW6;

import java.util.*;

public class ShiftRightTest {

	/*
	 * The main method is a test driver for the shiftRight() method of the MyArray class
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int[] A = new int[n];
		for (int k = 0; k < n; k++) {
			A[k] = input.nextInt();
		}
		MyArray.shiftRight(A);
		System.out.println(Arrays.toString(A));

	}

}

