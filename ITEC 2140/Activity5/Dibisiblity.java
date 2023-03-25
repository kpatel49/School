package Activity5;
import java.util.Scanner;

public class Dibisiblity {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = input.nextInt();
		if (num % 2 == 0 && num % 3 == 0){
			System.out.println(num+" is divisible by at least one of 2 and 3: true");
			}		
		
	}

}
