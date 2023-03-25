package Activity16;

import java.util.Arrays;

public class MyArray {
	
	public static int closestPairFast (int[] A) {
		int min = Integer.MAX_VALUE;
		Arrays.sort(A);
		for(int i = 0; i < A.length - 1; i++) {
			int dist = Math.abs(A[i] - A[i+1]);
			if (dist < min) {
				min = dist;
			}
		}
		return min;
	}

	public static int closestPairExhaustive(int[] A) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i + 1; j < A.length; j++) {
				int dist = Math.abs(A[i] - A[j]);
				if (dist < min) {
					min = dist;
				}
			}
		}
		return min;
	}

	public static int[] countLetters(String str) {
		int[] count = new int[26];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLowerCase(ch)) {
				count[ch - 'a']++;
			}
		}
		return count;
	}

	public static boolean linearSearch(int[] A, int x) {
		for (int i = 0; i < A.length; i++) {
			if (x == A[i]) {
				return true;
			}
		}
		return false;
	}
}
