package FinalTest;

import java.util.*;

public class AverageOfDigits {
	public static double averageOfDigits (String str) {	
		int sum = 0, count = 0;
		double avg = 0;
		//String num = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
				count++;				
			} 			
		}		
		/*for(int i = 0; i < num.length(); i++) {						
			
			sum =sum + i;
		}*/
		return avg = (sum/count);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();						
		System.out.printf("%.2f",AverageOfDigits.averageOfDigits(str));
	}
}

