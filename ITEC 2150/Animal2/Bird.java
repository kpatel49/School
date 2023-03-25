package Animal2;

public class Bird extends Animal {
	private double wingSpan;
	private double height;
	
//	public Bird(double wingSpan, double height) {
//		this.wingSpan = wingSpan;
//		this.height = height;
//	}		
//		

	/**
	 * constructor
	 * 
	 * @param age
	 * @param gender
	 * @param weight
	 * @param wingSpan
	 * @param height
	 */
	public Bird(int age, String gender, int weight, double wingSpan, double height) {
		super(age, gender, weight);
		this.wingSpan = wingSpan;
		this.height = height;
	}

	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void fly() {
		System.out.println(" ... flying");
	}

	@Override
	public void sleep() {
		System.out.println("Birds can sleep in the nest");
	}

	@Override
	public void eat() {
		System.out.println(" Bird loves catching the worms ... ");
	}

}