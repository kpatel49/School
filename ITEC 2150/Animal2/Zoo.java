package Animal2;


public class Zoo {
	public static void main(String[] args) {
		
		Bird bird1 = new Bird(10, "Female", 5, 30, 12);		
		Fish fish1 = new Fish(2, "Male", 150, 4, "Blue");
		
		Animal bird = new Bird(20, "Male", 30 ,50, 45);
		Animal fish = new Fish(100, "Female", 100, 10 ,"Green");
		
		bird.eat();
	}

}
