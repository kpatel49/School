
import java.util.Scanner;

public class MainDemo extends Calculus  {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two intagers");
		int intager1 = input.nextInt();
		int intager2 = input.nextInt();
		
		Calculus calculus =  new Calculus();
		Calculator calculator = new Calculator();
		calculator.calculateSum(intager1, intager2);
		
		
		MyCalculator myCalculator = calculus.new MyCalculator();		
		myCalculator.calculateSum(intager1, intager2);
		

	}

}
