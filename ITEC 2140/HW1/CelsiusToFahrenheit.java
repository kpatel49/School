package HW1;
import java.util.Scanner;

public class CelsiusToFahrenheit 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a temperature in Celsius: ");
		double Celsius = input.nextDouble();
		double Fahrenheit = ((Celsius*9/5)+32);
		System.out.printf("%.1f \u00B0C is %.1f \u00B0F ",Celsius,Fahrenheit);

	}
}
