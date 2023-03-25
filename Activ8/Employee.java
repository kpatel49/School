package Activ8;

class Employee implements Comparable<Employee> {
	private String name;
	private int salary;
	private int yearsInService;

	// Constructor
	public Employee(String nm, int rt, int yr) {
		this.name = nm;
		this.salary = rt;
		this.yearsInService = yr;
	}

	// Getter methods for accessing private data
	public double getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public int getYearsInService() {
		return yearsInService;
	}

	// Used to sort movies by year
	public int compareTo(Employee m) {
		return m.salary - this.salary;
	}
}
