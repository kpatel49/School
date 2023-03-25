package Arrays;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] evens = {2,4,6};
		int[] tripled = new int[evens.length];
		
		for(int i = 0; i < evens.length;i++) {
			tripled[i] = evens[i] *3;			
		}
		System.out.println(Arrays.toString(tripled));
	}

}
