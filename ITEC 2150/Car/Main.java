package Car;

public class Main {

	public static void main(String[] args) {
		car bradCar = new car("Compact", 4, 100);
		System.out.print(bradCar.getCapacity());
		bradCar.unload();
	}

}
