package Activity3;
import java.util.Scanner;

public class MinutesAndSeconds
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of seconds: ");
		int seconds = input.nextInt();
		int minutes =  seconds/60;
		int RemainingSeconds = seconds%60;
		System.out.println(seconds +" seconds is "+ minutes + " minutes and "+ RemainingSeconds +" seconds");
	}
}
