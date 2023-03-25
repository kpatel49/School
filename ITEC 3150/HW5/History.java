/*
 * 
 * Class: Test
 * @author Kush Patel
 * Course: ITEC 3150
 * 
 * This class:makes a History subclass that extends from the Course class and makes a constructor with the appropriate parameters like
 * area, recorded, and component. 
 *  
 * Purpose: make an History object 
 * 
 * */

public class History extends Course{
	
	private boolean area;
	private boolean recorded;
	private String component;
	
	public History(String catagory, String name, int CRN, boolean area, boolean recorded, String component) {
		super(catagory, name, CRN);
		this.area = area;
		this.recorded = recorded;
		this.component = component;
	}
	
	public boolean isArea() {
		return area;
	}
	public boolean isRecorded() {
		return recorded;
	}

	public String getComponent() {
		return component;
	}

	@Override
	public String toString() {
		return super.toString() + ", area=" + area + ", recorded=" + recorded + ", component=" + component + "]";
	}
	
	
	
}
