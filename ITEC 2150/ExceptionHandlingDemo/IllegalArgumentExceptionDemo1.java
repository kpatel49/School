package ExceptionHandlingDemo;

public class IllegalArgumentExceptionDemo1 {
	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter a non-negative number.");
		double number = input.nextDouble();

		if (number < 0) {
			throw new IllegalArgumentException(
					"Illegal Argument Exception occurred: SO you cannot enter the negative number. ");
		} else {
			doSomething(number);
		}
	}

	public static double doSomething(double number) {
		return number * 2;
	}
}
