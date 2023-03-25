package Activity15;

 public class MyArray {
	 
	public static void shiftLeft (int[] A) {
		int temp = A[0];
		for (int i = 0; i < A.length - 1; i++) {
			A[i] = A[i+1];
		}
		A[A.length - 1] = temp;
	} 
	
	public static void reverse (int[] A) {
		int left = 0;
		int right = A.length - 1;
		
		while (left < right) {
			swap(A, left, right);
			left++;
			right--;
		}
	}
	
	public static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

}
