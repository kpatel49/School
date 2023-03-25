package Activity2;
import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a temperature in Fahrenheit: ");
		double Fahrenheit = input.nextDouble();
		double Celsius = ((5*(Fahrenheit-32.0))/9.0);
		System.out.printf("%.1f \u00B0F is %.1f \u00B0C ",Fahrenheit,Celsius);
	}
}
