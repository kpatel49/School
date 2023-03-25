package multidimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Points {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {	
		
		Points obj = new Points();
		obj.getArray();

	}
	
	private void getArray() {
		System.out.println("How many pairs of x and y do you want to create? ");
		int pairs = scanner.nextInt();
		//declare a two dimensional arrays
		double[][] points = new double[pairs][2];
		
		System.out.println("Please enter " + pairs + " points of x and y");
		
		//we need to declare the points of the variables.
		
//		for(int i = 0; i < pairs; i++) {
//			points[i][0] = scanner.nextDouble();//y
//			points[i][1] = scanner.nextDouble();//x
//		}
		int i = 0;
		for(double[] innerarray : points) {
			points[i][0] = scanner.nextDouble();//y
			points[i][1] = scanner.nextDouble();//x
			i++;
		}
		
		System.out.println(Arrays.deepToString(points));
		
		
	}
	
	
	
}