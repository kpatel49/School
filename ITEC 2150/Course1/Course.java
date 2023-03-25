package Course1;

public class Course {

	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	/**
	 * method: dropStudent
	 * 
	 * @param student description: This method is going to remove a students from
	 *                the course. It means, student you want to remove is going to
	 *                removed from the array.
	 */
	public void dropStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equalsIgnoreCase(student)) {
				for (int k = i + 1; k < numberOfStudents; k++) {
					students[k - 1] = students[k];
				}
				numberOfStudents--;
				break;
			}
		}
	}
}