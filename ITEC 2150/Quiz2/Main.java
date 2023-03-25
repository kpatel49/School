package Quiz2;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course("Programming II");

		course1.addStudent("Marie Osmond");

		course1.addStudent("Susie Snell");

		course1.addStudent("Peter Parker Jr");

		course1.addStudent("Harry Potter");

		course1.addStudent("Mary Smith");

		System.out.println("Number of students in course1: " + course1.getNumberOfStudents());

		String[] students = course1.getStudents();

		StringBuilder studentList = new StringBuilder("Student Roster: ");

		int prefixLength = "Student Roster: ".length();

		for (int i = 0; i < course1.getNumberOfStudents(); i++) {

			if (studentList.length() >= prefixLength && i < course1.getNumberOfStudents() - 1) {

				studentList.append(students[i] + ", ");

			}

			else {

				studentList.append(students[i]);
			}

		}

		System.out.println(studentList);

		course1.dropStudent("Harry Potter");

		course1.dropStudent("Susie Snell");

		String[] newList = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++) {
			System.out.println(newList[i] + " ");
		}

//Complete this program to generate remaining //student name only once. No duplicate allowed.

	}

}

class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	/**
	 * constructor: Course
	 * 
	 * @param courseName
	 */
	public Course(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * method:addStudent
	 * 
	 * @param student void
	 */
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	/**
	 * method: getStudents
	 * 
	 * @return String[]
	 */
	public String[] getStudents() {
		return students;
	}

	/**
	 * method: getNumberOfStudents
	 * 
	 * @param none
	 * @return int
	 */
	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	/**
	 * method getCourseName
	 * 
	 * @param none
	 * @return String
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * method dropStudent
	 * 
	 * @param student
	 */
	public void dropStudent(String student) {
		/** Remove a student from the course */
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				// Move students[i + 1] to students[i], etc.
				for (int k = i + 1; k < numberOfStudents; k++) {
					students[k - 1] = students[k];
				}
				numberOfStudents--;
				break;
			}

		}

	}
}
