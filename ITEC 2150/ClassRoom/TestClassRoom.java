package ClassRoom;

public class TestClassRoom {

	public static void main(String[] args) {
		
		Wall wall1 = new Wall("West");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("South");
		Wall wall4 = new Wall("North");
		
		Ceiling ceiling = new Ceiling(45,"White");
		
		Desk desk = new Desk("Old",4,6,2,true);
		
		Student student = new Student("Bob",true);
		
		ClassRoom classRoom = new ClassRoom("Math",wall1,wall2,wall3,wall4,ceiling,desk,student);
	
		classRoom.organizeDesk();
		
		classRoom.getStudent().isSitting();
	
	}
	
}
