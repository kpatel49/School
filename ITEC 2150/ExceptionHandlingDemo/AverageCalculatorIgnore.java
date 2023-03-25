package ExceptionHandlingDemo;

/**
 * This class prompts the user for four numbers and then
 * computes the average and prints it.
 *
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageCalculatorIgnore
{

	public static void main(String[] args)
	{

		// declare variables
		Scanner consoleInput = new Scanner(System.in);

		double[] x = new double[4];
		double average = 0;
		double sum = 0;

		// input numbers
		for (int i = 0; i < 4; i++)
		{
			try
			{
				System.out.println("Enter number " + (i + 1) + ":");
				x[i] = consoleInput.nextDouble();
				sum = sum + x[i];
			} catch (InputMismatchException ex)
			{
				// ignore the error by reading the lingering delimiter
				consoleInput.nextLine();
			}
		}
		// compute average
		average = sum / 4.0;

		// output average to console
		System.out.println("The average is " + average);

	}

}