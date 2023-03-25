package Activity8;
import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		     
		      double i,n=0,s=0;
		  	double avg;
		  	{
		  	   
		          System.out.println("Enter a sequence of numbers: ");  
		           
		  	}
		  		for (i=0;i<6;i++)
		  		{
		  		    Scanner in = new Scanner(System.in);
		  		    n = in.nextDouble();
		  		    
		    		s +=n;
		  	}
		  	avg=s/6;
		  	System.out.printf("The sum is %.2f \n", s);
		  	System.out.printf("The average is %.2f \n", avg);
		  }
}
		  
