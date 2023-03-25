package HW5;

public class Letter {
	public static int countLetters(String s) {
		int letter = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch) || Character.isLowerCase(ch)) {
				letter++;
			}
		}
		return letter;

	}

}
