package activty1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Circle
{
	private static DecimalFormat df = new DecimalFormat("0.00");
	static Scanner number = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the radius of a circle: ");
		double radius = number.nextDouble();
	    double area = Math.PI *(radius*radius);
		double perimeter = Math.PI * 2 * radius;
		System.out.println("A circle of radius "+  df.format(radius) +" has area " + df.format(area) + " and perimeter "+ df.format(perimeter));
	}

}