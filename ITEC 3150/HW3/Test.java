/*
 * Class: Test
 * @author Kush Patel
 * Course: ITEC 3150 Spring 2021
 * 
 * This class: makes multiple threads and runs them one by one and the AddTask method implements runnable. 
 * 
 * Purpose: to test the program.
 * 
 * */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	private static Sum sum = new Sum();
	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(1);		
		
		executor.execute(new AddTask());
		
		executor.shutdown();
					
	}
	
	public static class AddTask implements Runnable{
		
		@Override
		public void run() {
			try {
				while(true) {
					sum.add(List.GenerateArray(), 20);
					Thread.sleep(1);				
					System.out.println(sum.getSharedTotal());
				}
				
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
