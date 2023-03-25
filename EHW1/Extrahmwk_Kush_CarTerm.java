
/*
 * Class: CarTerm
 * @author Kush Patel
 * Course: ITEC 3150 Spring 2021
 * 
 * Collaboration: I worked on the homework assignment alone, using this semester's course
 * materials.
 * 
 * This Class: has a default constructor and a constructor with the object number, the 
 * car name, and the random rank of the term. the class also has getters and setters and
 * a method that capitalizes the name of the car and a method that gets the first letter
 * of the name of the car.
 * 
 * */
public class Extrahmwk_Kush_CarTerm {

	private String name;
	private int rank;
	private int objNum;

	public Extrahmwk_Kush_CarTerm() {
		this.name = "xxxxx";
		this.rank = 0;
	}

	public Extrahmwk_Kush_CarTerm(int objNum, String name, int rank) {
		this.name = name;
		this.rank = rank;
		this.objNum = objNum;
	}

	public int getObjNum() {
		return objNum;
	}

	public void setObjNum(int objNum) {
		this.objNum = objNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "CarTerm [name=" + name + ", rank=" + rank + ", objNum=" + objNum + "]";
	}

	// capitalizes the name of the car.
	public String capitalize() {
		return this.name = this.name.toUpperCase();
	}

	// gets the first letter of the name.
	public char firstLetter() {
		return getName().charAt(0);
	}

}
