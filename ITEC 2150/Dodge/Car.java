package Dodge;

public class Car {
	private String color;
	private int wheels;
	
	public Car(String color, int wheels) {
		this.color = color;
		this.wheels = wheels;
	}
	
	public void carFeatures() {
		System.out.println("Car color " + color + " Wheels " + wheels);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	
	
	

}
