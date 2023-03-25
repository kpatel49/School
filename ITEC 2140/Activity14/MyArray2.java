package Activity14;

public class MyArray2 {

	public static int aboveAverage(double[] A) {
		double sum = 0, avg = 0;
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
		}
		avg = sum / A.length;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > avg) {
				count++;
			}
		}
		return count;
	}

}
