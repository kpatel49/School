

import java.util.Arrays;
import java.util.Random;

/*
 * Class: List
 * @author Kush Patel
 * Course: ITEC 3150 Spring 2021
 * 
 * This class: creates a method that creates an array size of 9000000. in the method the
 * array is populated with a random double number at each index.* 
 * 
 * Purpose: to create an array filled with 9000000 double numbers.
 * 
 * */
public class List {
	
	private static double[] array;
	
	public List() {
		
	}
	
	public static double[] GenerateArray() {
		array = new double[9000000];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = randomFill();			
		}
		
		return array;
		
	}

	public static double randomFill() {
		return (new Random()).nextDouble();
				
	}
	
	public static void print() {
		System.out.println(Arrays.toString(array));
	}

}
