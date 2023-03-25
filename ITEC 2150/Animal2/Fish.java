package Animal2;

public class Fish extends Animal {
	private int numberOfFins;
	private String color;
	
	public Fish(int newAge, String newGender, int newWeight, int fins, String col) {
		super(newAge, newGender, newWeight);
		this.numberOfFins = fins;
		this.color = col;
	}

	public int getNumberOfFins() {
		return numberOfFins;
	}

	public void setNumberOfFins(int numberOfFins) {
		this.numberOfFins = numberOfFins;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void swim() {
		System.out.println(" ...  swimming...");
	}
	@Override
	public void sleep() {
		System.out.println("Fish sleep in the coral and anemone...");
	}
	

}
