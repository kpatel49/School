package Test1;

public class WaffleHouse extends Waffle{
	private double price;

	
	public WaffleHouse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WaffleHouse(double flourCup, double sugarCup, double bakingSodateaSpoon, double saltteaSpoon, double price) {
		super(flourCup, sugarCup, bakingSodateaSpoon, saltteaSpoon);
		this.price = price;
	}
	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return (super.toString() + "price: $" + price);
	}

	
	
	
	
	
}
