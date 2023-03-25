package MyBedroom;

public class Lamp {
	
	private String style;
	private boolean battery;
	
	private int lifeTimeHours;

	public Lamp(String style, boolean battery, int lifeTimeHours) {
		this.style = style;
		this.battery = battery;
		this.lifeTimeHours = lifeTimeHours;
	}
	
	public void turnOn() {
		System.out.println("The lamp: Turn on the lamp");
	}
	public void turnOff() {
		System.out.println("The lamp: Turn off the lamp");
	}
	
	

}
