package AnimalKingdomPolymorphism;

public class Acqarium {
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalSound();
		
		Animal otter = new Otter();
		otter.animalSound();
		
		Animal shark = new Shark();
		shark.animalSound();
	}

}
