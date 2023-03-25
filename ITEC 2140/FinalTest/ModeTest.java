package FinalTest;

import java.util.*;

/*
 * DO NOT MODIFY THIS FILE!!!
 */

public class ModeTest {

	/*
	 * The main method is a test driver for the method mode() 
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = input.nextInt();
		}
		
		System.out.println(Arrays.toString(Mode.mode(A)));

	}

}

