package ArraysArrayList;

public class MultiArrayDemo1 {
	public static void main(String[] args) {
		int[][] c;
		c = new int[][] { { 0, 10, 56 }, { 56, 45, 78 }, { 102, 0, 21 } };
		System.out.println("Sum: " + getSumFrom2D(c));
		System.out.printf("Average: %.2f", getAverageFrom2D(c));
	}

	public static int getSumFrom2D(int[]... matrix) {
		int sum = 0;
//for each loop
		for (int[] innerArray : matrix) {
			for (int e : innerArray) {
				sum += e;
			}
		}
		return sum;

//        int sum = 0;
//        for(int i = 0; i < matrix.length; i++){
//            for(int j =0; j < matrix[i].length; j++){
//                sum += matrix[i][j];
//            }
//        }
//        return sum;
	}

	public static double getAverageFrom2D(int[]... matrix) {
		double sum = 0;
		//int i = 0, j = 0;
		int count = 0;
		for (int[] innerArray : matrix) {
			for (int e : innerArray) {
				sum += e;
				count++;
			}
		}
		return sum/count;
//		for (i = 0; i < matrix.length; i++) {
//			for (j = 0; j < matrix[i].length; j++) {
//				sum += matrix[i][j];
//			}
//		}
//		return sum / (i * j);

	}
}
