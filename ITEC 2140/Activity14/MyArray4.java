package Activity14;

public class MyArray4 {

	public static int indexOfMin(double[] A) {
		double max = Integer.MIN_VALUE;
		int max1 = 0, count = 0;
		for (int i = 0; i < A.length; i++) {
			max = Math.max(max, A[i]);
			max1 = (int) max;
		}
		for (int i = 0; i < A.length; i++) {
			if (max1 == A[i]) {
				count++;
			}

		}
		return count;
	}
}
