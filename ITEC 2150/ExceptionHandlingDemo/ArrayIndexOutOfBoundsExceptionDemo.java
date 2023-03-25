package ExceptionHandlingDemo;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

	public static void main(String[] args) {
		int[] list = {1,2,3,4};
		
		Scanner input = new Scanner(System.in);
		int indexNumber = 0;
		
		try {
		System.out.println("Enter the last index number to print the last element of this array. ");
		indexNumber = input.nextInt();
		System.out.println(list[indexNumber]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			input.nextLine();
		}
	}

}
