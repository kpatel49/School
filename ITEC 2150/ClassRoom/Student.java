package ClassRoom;

public class Student {
	
	private String name;
	private boolean bag;
	
	public Student(String name, boolean bag) {
		this.name = name;
		this.bag = bag;
	}
	
	public void isSitting() {
		System.out.println("All students are sitting on thier chair...");
	}
	
	public void isNotSitting() {
		System.out.println("Students are not sitting on the chair because class is over");
	}
	

}
