package Computer;

public class Case {
	
	private String model;
	private String manufacturer;
	private Dimension dimension;
	private String caseMaterial;
	private String color;
	private int gpuLength;
	
	public Case(String model, String manufacturer, Dimension dimension, String caseMaterial, String color,
			int gpuLength) {
		
		this.model = model;
		this.manufacturer = manufacturer;
		this.dimension = dimension;
		this.caseMaterial = caseMaterial;
		this.color = color;
		this.gpuLength = gpuLength;
	}
	
	public void powerOn() {
		System.out.println("Power button on");
	}
	
	public void powerOff() {
		System.out.println("Button is pressed to turn off");
	}


}
