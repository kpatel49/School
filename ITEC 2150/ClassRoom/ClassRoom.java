package ClassRoom;

public class ClassRoom {
	private String name;
	private Wall wall1;
	private Wall wall2;
	private Wall wall3;
	private Wall wall4;

	private Ceiling ceiling;
	
	private Desk desk;
	private Student student;

	public ClassRoom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling,Desk desk,Student student) {
		this.name = name;
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.ceiling = ceiling;
		this.desk = desk;
		this.student = student;
	}
	
	public void organizeDesk() {
		System.out.println("Classroom: Organizing the desk... this is from the CalssRoom class");
		desk.organize();
		this.organize();
	}
	
	public void organize() {
		putBookInTheDesk();
		putPencilsInCup();
	}
	
	public void putBookInTheDesk() {
		System.out.println("Putting the books in the desk");
	}
	
	public void putPencilsInCup() {
		System.out.println("Putting the penciles in a cup");
	}

	public Student getStudent() {
		return this.student;
	}
	

}
