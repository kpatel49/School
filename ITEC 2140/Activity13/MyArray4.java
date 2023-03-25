package Activity13;

import java.util.*;

public class MyArray4 {
	
	public static int[] randomInit(int n, int start, int end) {
		int[] A = new int[n];
		Random random = new Random(2140);
		for (int i = 0; i < n; i++) {
			A[i] = random.nextInt(end - start) + start;
		}
		return A;
	}
	
	public static int[] initialize(int n) {
		int[] A = new int [n];
		for(int i = 0; i < n; i++) {
			A[i] = i;
		}
		return A;
	}

}
