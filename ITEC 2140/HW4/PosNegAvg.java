package HW4;
import java.util.Scanner;

public class PosNegAvg {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int num = input.nextInt();
		int pos = 0 , neg = 0;
		double sum = 0;
		int count = 0;
		double avg = 0;
		if (num == 0) {
			System.out.println("No numbers are entered except 0");
			return;
		}
		while (num != 0 ) {
			if (num > 0) {
				pos = pos+1;
			}else {
				neg = neg+1;
			}
			sum += num;
			count++;					
			num = input.nextInt();
		}
		avg = sum / count;
		System.out.println("The number of positives is "+pos);
		System.out.println("The number of negatives is "+neg);
		System.out.printf("The total is %.1f \n",sum);
		System.out.printf("The average is %.2f",avg);
	}

}
