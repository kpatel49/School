package Animal;

public class Zoo {
	
	public static void main(String[] args) {
		Animal a1 = new Animal(12,"F",20);
		a1.eat();
		
		Bird b1 = new Bird();
		b1.fly();
		
		Fish f1 = new Fish();
		f1.swim();
	}

}
