package ClassRoom;

public class Desk {
	
	private String style;
	private int legs;
	private int height;
	private int shelves;
	private boolean chair;
	
	public Desk(String style, int legs, int height, int shelves, boolean chair) {
		this.style = style;
		this.legs = legs;
		this.height = height;
		this.shelves = shelves;
		this.chair = chair;
	}
	
	public void organize() {
		System.out.println("This is form the desk class... Organizing the desk...");
	}

}
