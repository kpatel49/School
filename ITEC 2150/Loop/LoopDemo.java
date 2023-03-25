package Loop;

public class LoopDemo {
	public static void main(String[] args) {
//		int count = 0;
//		for(int i = 0; i != 6; i++) {
//			System.out.println("Count value is " + count);
//		}
		
		int count = 6;
		do {
			System.out.println("Count value is " + count);
			count++;
			
			if(count > 100) {
				break;
			}
		}while(count != 6);
		
	}

}
