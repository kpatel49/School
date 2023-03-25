import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Run2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many bins would you like? ");
		int bin = input.nextInt();
		int range = 100 / bin;
		int f[] = new int[bin];
		try {
			Scanner fileScanner = new Scanner(
					new File("C:\\Users\\kjp25\\eclipse-workspace\\GT Java HW\\src\\grades.csv"));
			while (fileScanner.hasNext()) {
				String num = "";
				String line = fileScanner.nextLine();
				for (int i = 0; i < line.length(); i++) {
					char ch = line.charAt(i);
					if (Character.isDigit(ch)) {
						num += Character.toString(ch);
					}
				}
				int n = Integer.parseInt(num);
				int i = 0;
				int x = 101;
				int y = 100 + range;
				int a = 101, b = 101;
				if (bin == 101) {
					for (i = 0; i < bin; i++) {
						a = a - 1;
						b = b - 1;
						if (n == a) {
							f[i]++;
						}
					}
				} else {
					for (i = 0; i < bin; i++) {
						y = y - range;
						x = x - range;
						if (i == (bin - 1)) {
							x = 0;
						}
						if (n <= y && n >= x) {
							f[i]++;
						}

					}
				}

			}
			int a = 101, b = 101;
			if (bin == 101) {
				for (int i = 0; i < f.length; i++) {
					a = a - 1;
					b = b - 1;
					System.out.printf("%3d - %3d", a, b);
					System.out.print(" | ");
					if (f[i] == 0) {
						System.out.println();
					} else if (f[i] > 0) {
						for (int j = 0; j < f[i]; j++) {
							System.out.print("[]");
						}
						System.out.println();
					}
				}
			} else {

				int x = 101;
				int y = 100 + range;
				for (int i = 0; i < f.length; i++) {
					y = y - range;
					x = x - range;
					if (i == (bin - 1)) {
						x = 0;
					}
					System.out.printf("%3d - %2d", y, x);
					System.out.print(" | ");
					if (f[i] == 0) {
						System.out.println();
					} else if (f[i] > 0) {
						for (int j = 0; j < f[i]; j++) {
							System.out.print("[]");
						}
						System.out.println();
					}
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
