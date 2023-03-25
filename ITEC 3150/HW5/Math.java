/*
 * 
 * Class: Test
 * @author Kush Patel
 * Course: ITEC 3150
 * 
 * This class: makes a Math subclass that extends from the Course class and makes a constructor with the appropriate parameters like STEM and Component.
 * 
 *  
 * Purpose: create an object 
 * 
 * */
public class Math extends Course {

	private boolean STEM;
	private String Component;

	public Math(String catagory, String name, int CRN, boolean sTEM, String component) {
		super(catagory, name, CRN);
		this.STEM = sTEM;
		this.Component = component;
	}

	public boolean isSTEM() {
		return STEM;
	}

	public String getComponent() {
		return Component;
	}

	@Override
	public String toString() {
		return super.toString() + ", STEM=" + STEM + ", Component=" + Component + "]";
	}

}
