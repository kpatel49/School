package Activity3;
import java.util.Scanner;

public class LoanCalculator
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the loan amount: ");
		double amount = input.nextDouble();
		System.out.println("Enter the loan term (in number of years): ");
		double term = input.nextDouble();
		System.out.println("Enter the annual interest rate: ");
		double InterestRate = input.nextDouble();
		double Month = term*12;
		double MonthlyInterestRate = (InterestRate/100);
		double x = amount*MonthlyInterestRate;
		double y = (1 - 1/Math.pow(1 + MonthlyInterestRate, Month));
		double total =(x/y)+amount;
		double monthly = total/Month;
		System.out.printf("The monthly payament is $%.2f",monthly);
		System.out.println();
		System.out.printf("The total payment is $%.2f",total);
	}
}