package Pizza;

public class MeatLoversPizza extends Pizza{
	
	public MeatLoversPizza() {
		super("Meat Lovers","wagyu beef",35.00,"Pan");
		super.addPizzaToppingAddition1("Fresh Mozzarella", 1.00);
		super.addPizzaToppingAddition2("A1 bbq sauce", .50);
		super.addPizzaToppingAddition3("Bacon", 1.50);
	}
	

}
