package Final;

public class Customer implements WaitingCustomer{
	
	String name;
	String drinkOrdered;
	
	public Customer(String name, String drinkOrdered) {
		this.name = name;
		this.drinkOrdered = drinkOrdered;
	}

	@Override
	public void orderReady(String completeDrink) {
		if(drinkOrdered == completeDrink) {
			exitStore();
		}		
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDrinkOrdered() {
		return drinkOrdered;
	}
	
	public void exitStore() {
		System.out.println(name + ": Thank you, I’ve received my " + drinkOrdered + " and leaving the store now. Good bye.");
	}
	
	

}
