
/*
 * Class: Sum
 * @author Kush Patel
 * Course: ITEC 3150 Spring 2021
 * 
 * This class: call the array of numbers from the List.java class and add all the values in
 * the array and stores the sum into the sharedTotal variable.
 * 
 * Purpose: to add and stores all values in an array.
 * 
 * */

import java.util.concurrent.locks.ReentrantLock;

public class Sum {

	private static ReentrantLock lock = new ReentrantLock();
	private double sharedTotal = 0;

	public double getSharedTotal() {
		return sharedTotal;
	}

	public void add(double[] array, int num) {
		lock.lock();
		try {
			double total = 0;
			for (int i = 0; i < array.length; i++) {
				total = sharedTotal + array[i];
			}
			Thread.sleep(5);
			sharedTotal = total;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();

		}
	}

}
