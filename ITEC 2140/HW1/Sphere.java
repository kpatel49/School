package HW1;
import java.util.Scanner;

public class Sphere
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of a sphere: ");
		double radius = input.nextDouble();
		double V = ((4*Math.PI*radius*radius*radius)/3);
		double A = (4*Math.PI*radius*radius);
		System.out.printf("A sphere of radius %.2f has volume %.2f and surface area %.2f",radius,V,A);
	}
}
