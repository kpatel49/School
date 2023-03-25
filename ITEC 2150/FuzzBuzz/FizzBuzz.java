package FuzzBuzz;

public class FizzBuzz {
	private int sn;
	private int en;

	public FizzBuzz() {
		this(1, 20);
	}

	public FizzBuzz(int sn, int en) {
		this.sn = sn;
		this.en = en;
	}

	public int getSn() {
		return sn;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}

	public int getEn() {
		return en;
	}

	public void setEn(int en) {
		this.en = en;
	}

	public void count() {
		int sn = getSn();
		int en = getEn();
		for (int i = sn; i <= en; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz");
			} else if (i % 3 == 0) {
				System.out.println("fizz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}
	}

	public void count(FizzBuzz o) {
		this.sn = o.sn;
		this.en = o.en;

		int number = this.sn;
		while (number <= this.en) {
			if (number % 3 == 0 && number % 5 == 0) {
				System.out.println("fizzbuzz");
			} else if (number % 3 == 0) {
				System.out.println("fizz");
			} else if (number % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(number);
			}
			number++;
		}
	}

}