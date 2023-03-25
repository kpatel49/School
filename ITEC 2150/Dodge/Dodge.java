package Dodge;

public class Dodge extends Car{
	
	public Dodge() {
		this("Blue", 6);
	}
	
	public Dodge(String color, int wheels) {
		super(color, wheels);
		
	}
	
	public void setStart() {
		Dodge dodge = new Dodge("Red", 4);
	}

}


