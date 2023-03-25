package Activity13;

import java.util.*;

public class InitEvenTest {

	/*
	 * The main method is a test driver for the initEven() method of the Array class
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(Arrays.toString(MyArray.initEven(n)));

	}

}
