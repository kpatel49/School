package Activity2;
import java.util.Scanner;

public class Gratuity
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double G = input.nextDouble();
		double gratuity = (G/100);
		double x = gratuity*subtotal;
		double total = subtotal + x;
		System.out.printf("The gratuity is $%.1f and total is $%.1f",x,total);
	}
}
