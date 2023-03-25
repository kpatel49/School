package MyBedroom;

public class TestMyBedroom {

	public static void main(String[] args) {
		
		Wall wall1 = new Wall("West");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("South");
		Wall wall4 = new Wall("North");
		
		Ceiling ceiling = new Ceiling(30,"light blue");
		
		Bed bed = new Bed("Modern", 2, 3, 7, 1);
		
		Lamp lampRight = new Lamp("Modern", false, 1000);
		Lamp lampLeft = new Lamp("Modern", false, 1000);
		
		
		Bedroom masterBedroom = new Bedroom("Winky, Candy, and Lucy", wall1, wall2, wall3, wall4, ceiling, bed, lampRight);
		
		masterBedroom.makeBed();
		
		masterBedroom.getLamp().turnOn();
	}

}
