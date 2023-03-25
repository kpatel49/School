
public class ThreadRunnable implements Runnable {

	private Sum sum;

	public ThreadRunnable(Sum sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		sum.add(1);
	}
}
