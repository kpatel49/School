
/**
 * Class: Course
 * 
 * @author Kush Patel
 * @version 1. Course : ITEC 3150
 * 
 *          This class: describes the common attributes and methods of the
 *          Course being collected into a list.
 * 
 *          Purpose: This class is intended to serve as a parent class only for
 *          the different types of Courses.
 * 
 */

public class Course {

	private String category;
	private String name;
	private int CRN;

	public Course(String category, String name, int CRN) {
		this.category = category;
		this.CRN = CRN;
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public String getName() {
		return name;
	}

	public int getCRN() {
		return CRN;
	}

	@Override
	public String toString() {
		return "Course [category=" + category + ", name=" + name + ", CRN=" + CRN + " ";
	}

}
