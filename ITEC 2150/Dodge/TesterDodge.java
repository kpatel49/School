package Dodge;

public class TesterDodge {

	public static void main(String[] args) {
		Car c1 = new Car("Red", 4);
		c1.carFeatures();
		Dodge d1 = new Dodge("Green", 7);
		d1.carFeatures();
		Dodge d2 = new Dodge();
		d2.carFeatures();
		

	}

}
