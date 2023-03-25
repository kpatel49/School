import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Run3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many bins would you like? ");
		int bin = input.nextInt();
		int range = 100 / bin;
		int a = 101, b = 101;
		int x = 101;
		int y = 100 + range;
		int count = 0;
		int f[] = new int[bin];
		String line = " ";
		char ch = line.charAt(0);
		try {
			Scanner fileScanner = new Scanner(
					new File("C:\\Users\\kjp25\\eclipse-workspace\\GT Java HW\\src\\grades.csv"));
			while (fileScanner.hasNext()) {
				
				line = fileScanner.nextLine();
				for (int i = 0; i < line.length(); i++) {
					ch = line.charAt(i);
					if (Character.isDigit(ch)) {
						System.out.print(ch);

					}
				}
				if (bin == 101) {
					for (int i = 0; i < bin; i++) {
						a = a - 1;
						b = b - 1;
						f[i] = a;
						System.out.println(a + " - " + b + " |");
						System.out.println(f[i]);
					}
				} else {
					for (int i = 0; i < bin; i++) {
						y = y - range;
						x = x - range;
						if (x == 1) {
							x = 0;
						}
						if (ch <= y && ch >= x) {
							for (i = 0; i <= f.length; i++) {
								count++;
								//f[i] = count;
							}
						}
					}
					//System.out.println(f[0]);
					System.out.print("\n");
				}
				System.out.println(count);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
