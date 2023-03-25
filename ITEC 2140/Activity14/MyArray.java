package Activity14;

public class MyArray {
	
	public static int indexOfMax(double[] A) {
		int index = 0;
		double max = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i] > max) {
				max = A[i];
				index = i;
			}
		}
		return index;
	}
	
	public static int aboveAverage(double[] A) {
		double average = average(A);
		int count = 0;
		for (double a : A) {
			if (a > average) {
				count++;
			}
	}
		return count;
}
	public static double average(double[] A) {
		double sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
		}
		return sum / A.length;
	}

}

