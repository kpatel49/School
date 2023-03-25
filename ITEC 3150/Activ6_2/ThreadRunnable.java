
public class ThreadRunnable implements Runnable {

	private Sum sum;

	public ThreadRunnable(Sum sum) {
		this.sum = sum;
	}

	public synchronized void run() {
		try {
			sum.add(1);
			Thread.sleep(1);
		}
		catch(InterruptedException e) {
			System.out.print(e);
		}
	}
}