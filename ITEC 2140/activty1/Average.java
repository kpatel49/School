package activty1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Average 
{
	private static DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args)
	{
		Scanner number = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		double x = number.nextDouble();
		double y = number.nextDouble();
		double z = number.nextDouble();
		double Average = (x+y+z)/3;
		System.out.print("The average of " + df.format(x) +", "+ df.format(y) + " and " + df.format(z) + " is " + df.format(Average));
	}
}
