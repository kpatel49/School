package Stack;

public class Main {

	
	public static void main(String[] args) {
		
		StackOfInteger s1 = new StackOfInteger();
		for(int i = 0; i < 10; i++) {
			s1.push(i);
		}
		
		while(!s1.empty()) {
			System.out.print(s1.pop() + " ");
		}
		

	}

}
