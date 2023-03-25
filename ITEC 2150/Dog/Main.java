package Dog;

public class Main {

	public static void main(String[] args) {
		Dog winky = new Dog();
		winky.name = "Winky";
		winky.age = 15;
		winky.breed = "Min. Dachshund";
		winky.writeOutput();
		
		Dog rae = new Dog();
		rae.name = "Rae";
		rae.age = 1;
		rae.breed = "Pitbull";
		rae.writeOutput();

	}

}
