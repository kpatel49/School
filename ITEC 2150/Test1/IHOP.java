package Test1;

public class IHOP extends Waffle{
	private double price;

	public IHOP(double flourCup, double sugarCup, double bakingSodateaSpoon, double saltteaSpoon,double price) {
		super(flourCup, sugarCup, bakingSodateaSpoon, saltteaSpoon);
		this.price = price;
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return (super.toString() + "price: $" + price);
	}

	
	
	

}
