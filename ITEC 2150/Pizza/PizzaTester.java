package Pizza;

public class PizzaTester {

	public static void main(String[] args) {
		
		
		Pizza p1 = new Pizza("Regular","Pepperoni",9.00,"Hand tossed");
		p1.addPizzaToppingAddition1("Onions", 1.0);
		p1.addPizzaToppingAddition2("Pineapple", 1.00);
		p1.addPizzaToppingAddition3("Mushroom", 1.25);
		p1.addPizzaToppingAddition4("Extra Cheese", 1.00);
		System.out.println("Total pizza price is " + p1.informationAboutAddition());
		
		VeganPizza vp1 = new VeganPizza("beyond beef",15.00);
		vp1.addVeganToppingAddition1("artichoke", 2.00);
		vp1.addVeganToppingAddition2("broccoli", 1.50);
		System.out.println("Total vegan pizza price is "+ vp1.informationAboutAddition());;

	}

}
