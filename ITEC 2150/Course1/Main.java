package Course1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Course c1 = new Course("Intermediate Programming");
		Course c2 = new Course("Advanced Programming");
		
		c1.addStudent("Brad Nguyen");
		c1.addStudent("Clifford Briggs");
		c1.addStudent("Kris Hendricks");
		c1.addStudent("Joonseo Kim");
		
		c2.addStudent("Anthony Morse");
		c2.addStudent("Kevin Lim");
		c2.addStudent("Derrick Twumsi");
		c2.addStudent("Nicole Osaseri");
		
		System.out.println("Number of students in the Intermediate Programming: " + c1.getNumberOfStudents());
		
		String[] students = c1.getStudents();

		StringBuilder studentList = new StringBuilder("Student Roster: ");
		int prefixLength = "Student Roster: ".length();
		
		for(int i = 0; i < c1.getNumberOfStudents(); i++) {
			if(studentList.length() >= prefixLength && i < c1.getNumberOfStudents() - 1) {
				studentList.append(students[i] + ", ");
			}
			else {
				studentList.append(students[i]);
			}	
			
		}
		System.out.println(studentList);
	}

}
