
public class Test {

	public static void main(String[] args) {

		Sum sum1 = new Sum();

		for (int i = 0; i < 1000; i++) {
			Thread newThread = new Thread(new ThreadRunnable(sum1));
			newThread.start();
		}

	}

}
