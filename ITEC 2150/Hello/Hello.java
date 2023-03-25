package Hello;

public class Hello {
	//instance variable named name. it's visibility is going to be private and it is a String type variable
	private String name; 
	private String introduction;
	
	//
	//no-argument constructor
	public Hello() {
		name = "Marco Chairez";
		introduction = "ITEC 2150";
	}
	
	//constructor taking two parameters
	public Hello(String name, String introduction) {
		this.name = name;
		this.introduction = introduction;
	}
	
	public String getName() {
		return name;
	}
	
	public String getIntroduction() {
		return introduction;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
}
