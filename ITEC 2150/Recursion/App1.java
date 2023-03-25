package Recursion;

public class App1 {
	
	public static void main(String[] arr) {
		reduceByOne(5);
	}
	
	public static void reduceByOne(int n) {
		System.out.println("Entering n is " + n);
//		if(n == 0) {
//			System.out.println("Complete Call: " + n);
//		}
		
		if(n > 0) {
			reduceByOne(n-1);
		}
		System.out.println("Complete Call: " + n);
	}

}
