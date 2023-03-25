package FinalTest;

public class Mode {
	public static int[] mode(int[] A) {
		int max = A[0];
		int maxCount = 0;
		int a[] = new int[2];
		for (int i = 0; i < A.length; i++) {
			int count = 0;
			for (int j = 0; j < A.length; j++) {
				if (A[j] == A[i]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				max = A[i];
			} else if (A[i] > max && count == maxCount) {
				max = A[i];
			}
		}
		a[0] = max;
		a[1] = maxCount;
		return a;
	}

}
