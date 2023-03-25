/*
 * 
 * Class: Test
 * @author Kush Patel
 * Course: ITEC 3150
 * 
 * This class: makes a English subclass that extends from the Course class and makes a constructor with the appropriate parameters like
 * level, and type.
 *  
 * Purpose: to make an English object.
 * 
 * */
public class English extends Course{
	
	private String level;
	private String type;
	
	public English(String catagory, String name, int CRN, String level, String type) {
		super(catagory, name, CRN);
		this.level = level;
		this.type = type;
			
	}

	public String getLevel() {
		return level;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return super.toString() + ", level=" + level + ", type=" + type + "]";
	}
	
	
	
	

}
