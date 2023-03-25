
import java.io.*;
import java.util.*;

public class CourseList {

	private ArrayList<Course> courseListItems = new ArrayList<Course>();

	public void printcourseListItems() {
		for (int i = 0; i < courseListItems.size(); i++) {
			Course temp = courseListItems.get(i);
			System.out.println(temp);
		}
	}

	public Course searchByName(String name) {
		Course item = null;
		for (Course temp : courseListItems) {
			if (temp.getName().equalsIgnoreCase(name)) {
				item = temp;
			}
		}
		return item;
	}

	public ArrayList<Course> getcourseListItems() {
		return courseListItems;
	}

	public void addItem(Course n) {
		courseListItems.add(n);
	}

	public void removeItem(String name) {
		Course x = this.searchByName(name);
		if (x != null) {
			courseListItems.remove(x);
		}
	}

	public static void main(String[] args) {

		CourseList myCourseList = new CourseList();

		File courseFile = new File("C:\\Users\\kjp25\\eclipse-workspace\\ITEC 3150\\src\\Hw1\\course.txt");
		Scanner courseReader = null;
		try {
			courseReader = new Scanner(courseFile);
		} catch (FileNotFoundException e) {
			System.out.println("No CourseList was found or it is empty");
		}

		while (courseReader != null && courseReader.hasNext()) {

			String catagory = courseReader.nextLine();
			String name = courseReader.nextLine();
			String CRN = courseReader.nextLine();
			int CRN_Number = Integer.parseInt(CRN);

			if (catagory.equalsIgnoreCase("English")) {
				String level = courseReader.nextLine();
				String type = courseReader.nextLine();

				English english = new English(catagory, name, CRN_Number, level, type);
				myCourseList.addItem(english);

			} else if (catagory.equalsIgnoreCase("Math")) {
				String temp = courseReader.nextLine();
				boolean STEM = Boolean.parseBoolean(temp);
				String Component = courseReader.nextLine();

				Math math = new Math(catagory, name, CRN_Number, STEM, Component);
				myCourseList.addItem(math);
			} else if (catagory.equalsIgnoreCase("History")) {
				String temp1 = courseReader.nextLine();
				boolean area = Boolean.parseBoolean(temp1);
				String temp2 = courseReader.nextLine();
				boolean recorded = Boolean.parseBoolean(temp2);
				String component = courseReader.nextLine();

				History history = new History(catagory, name, CRN_Number, area, recorded, component);
				myCourseList.addItem(history);
			} else {
				System.out.println("Unknown Course type " + catagory);
			}
		}

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Course List.");
		boolean done = false;
		while (!done) {
			System.out.println("Would you like to :");
			System.out.println("  1. View contents of Course List");
			System.out.println("  2. Search for a course");
			System.out.println("  3. Remove a course");
			System.out.println("  4.  Exit");
			String tp = input.nextLine();
			int num = Integer.parseInt(tp);
			if (num == 1) {
				myCourseList.printcourseListItems();
			} else if (num == 2) {
				System.out.println("Enter course name");
				String id = input.nextLine();
				Course item = myCourseList.searchByName(id);
				if (item != null) {
					System.out.println(item);
				} else {
					System.out.println("Sorry the course was not found");
				}
			} else if (num == 3) {
				System.out.println("Enter course name");
				String courseName = input.nextLine();
				myCourseList.removeItem(courseName);
			} else {
				done = true;

				PrintWriter out = null;

				try {
					out = new PrintWriter(new File("C:\\Users\\kjp25\\eclipse-workspace\\ITEC 3150\\src\\Hw1\\course.txt"));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}

				for (Course c : myCourseList.getcourseListItems()) {

					out.println(c.getCategory());
					out.println(c.getName());
					out.println(c.getCRN());

					if (c.getCategory().equalsIgnoreCase("English")) {

						English e = (English) c;
						out.println(e.getLevel());
						out.println(e.getType());
					} else if (c.getCategory().equalsIgnoreCase("Math")) {

						Math m = (Math) c;
						out.println(m.isSTEM());
						out.println(m.getComponent());
					} else if (c.getCategory().equalsIgnoreCase("History")) {

						History h = (History) c;
						out.println(h.isArea());
						out.println(h.isRecorded());
						out.println(h.getComponent());
					} else {
						System.out.println("Unknown Course type " + c.getCategory());
					}
				}
				out.close();
			}
		}
	}

}
