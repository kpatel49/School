
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
		return super.toString() + " English [level=" + level + ", type=" + type + "]";
	}
	
	
	
	

}
