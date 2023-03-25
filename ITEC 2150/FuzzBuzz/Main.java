package FuzzBuzz;

public class Main {

	public static void main(String[] args) {
		
//		FizzBuzz f1 = new FizzBuzz();
//		f1.setSn(1);
//		f1.setEn(10);
//		f1.count();
//		
//		FizzBuzz o1 = new FizzBuzz();
//		o1.count();
		
		FizzBuzz o1 = new FizzBuzz(40,80);
		System.out.println(o1.getSn());
		o1.count(o1);

	}

}
