package Activity16;

import java.util.Scanner;

public class CountLettersTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		int count[] = MyArray.countLetters(str);
		for (int i = 0; i < 26; i++) {
			if (count[i] > 0) {
				System.out.printf("%c: %d\n", (char) ('a' + i), count[i]);
			}
		}
	}

}
