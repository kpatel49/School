package Activity14;

public class MyArray3 {

	public static int indexOfMax(double[] A) {
		double min = Integer.MAX_VALUE;
		int min1 = 0;
		for (int i = 0; i < A.length; i++) {
			min = Math.min(min,A[i]);
			min1 = (int) min;
			
		}		
		return min1;
	}

}
