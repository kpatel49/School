package Activity13;

import java.util.*;

public class MyArray {

	public static int[] initEven(int n) {
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = 2 * i;
		}
		return a;
	}

}
