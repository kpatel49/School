package Activity13;

import java.util.*;

public class RandomInitTest {

	/*
	 * The main method is a test driver for the randomInit() method of the MyArray class
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int start = input.nextInt();
		int end = input.nextInt();
		System.out.println(Arrays.toString(MyArray4.randomInit(n, start, end)));
	}

}
