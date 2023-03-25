package HW5;

public class Number {
	public static int reverse(int number) {
		int reverse = 0;
		int digit;

		do {
			digit = number % 10;
			reverse = reverse * 10 + digit;
			number /= 10;
		} while (number != 0);
		return reverse;
	}

	public static boolean isPalindrome(int number) {
		return (number == reverse(number));
	}
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void generatePalindromicPrimes(int x) {
		for (int i = 2; i <= x; i++) {
			if (isPrime(i) && isPalindrome(i)) {
				System.out.print(i + " ");
			}
		}
	}
}

