import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many bins would you like? ");
		int bin = input.nextInt();
		
		
		int range = 100 / bin;
		int a = 101, b = 101;
		int x = 101;
		int y = 100 + range;
		int f[] = new int [bin];
		if (bin == 101) {
			for (int i = 0; i < bin; i++) {
				a = a - 1;
				b = b - 1;
				f[i] = a;
				System.out.println(a + " - " + b + " |");
				//System.out.println(f[i]);
			}			
		} else {
			for (int i = 0; i < bin; i++) {
				y = y - range;
				x = x - range;
				f[i] = y;							
				if (x == 1) {
					x = 0;
				}
				System.out.println(y + " - " + x + " |");
				//System.out.println(f[i]);
							}
			
		}		
		
	}

}