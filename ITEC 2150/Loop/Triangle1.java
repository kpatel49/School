package Loop;

public class Triangle1 {

	public static void main(String[] args) {
		
		// nested loops
		for(int row = 1; row <= 5;row++) {
			for(int column = 1; column <= row; column++) {
				System.out.print(column + " ");
			}
			System.out.println();
		}

	}

}
