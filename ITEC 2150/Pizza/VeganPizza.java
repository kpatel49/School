package Pizza;

public class VeganPizza extends Pizza {

	private String veganToppingName1;
	private double veganToppingPrice1;
	private String veganToppingName2;
	private double veganToppingPrice2;

	public VeganPizza(String meat, double price) {
		super("Vegan", meat, price, "cauliflower crust");
	}

	public void addVeganToppingAddition1(String name, double price) {
		this.veganToppingName1 = name;
		this.veganToppingPrice1 = price;
	}

	public void addVeganToppingAddition2(String name, double price) {
		this.veganToppingName2 = name;
		this.veganToppingPrice2 = price;
	}

	@Override
	public double informationAboutAddition() {
		double pizzaPrice = super.informationAboutAddition();
		if (this.veganToppingName1 != null) {
			pizzaPrice += this.veganToppingPrice1;
			System.out.println("Added " + this.veganToppingName1 + " for an extra " + this.veganToppingPrice1);
		}
		if (this.veganToppingName2 != null) {
			pizzaPrice += this.veganToppingPrice2;
			System.out.println("Added " + this.veganToppingName2 + " for an extra " + this.veganToppingPrice2);
		}

		return pizzaPrice;

	}

}
