package FinalTest;

public class Intersection {
	public static int intersection(int[] A, int[] B) {
		int Count = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if (B[j] == A[i]) {
					Count++;
				}
			}
		}
		return Count;
	}

}
