package ExceptionHandlingDemo;

public class ArithmaticExceptionDemo {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		boolean continueLoop = true;
		do {
			try {
				System.out.println("Enter an integer for a numerator");
				int numerator = input.nextInt();

				System.out.println("Enter an integer for a denominator");
				int denominator = input.nextInt();
				System.out.println("The result of " + numerator + "/ " + denominator+ " = " + (numerator / denominator));
				continueLoop = false;
			} catch (ArithmeticException ae) {
				System.out.println(ae);
				ae.printStackTrace();
				input.nextLine();
				System.out.println("Try it again. ");
			}
		} while (continueLoop);

	}

}
