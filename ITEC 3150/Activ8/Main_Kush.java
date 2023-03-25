package Activ8;


import java.util.LinkedList;
import java.util.Collections;

public class Main_Kush {

	public static void main(String[] args) {
		LinkedList<Employee> list = new LinkedList<Employee>();

		list.add(new Employee("Ana Joo", 2000, 10));
		list.add(new Employee("Joe Jomey", 5000, 3));
		list.add(new Employee("Gene Samu", 2800, 1));
		list.add(new Employee("Joana Sick", 4000, 5));
		list.add(new Employee("Emma Emm", 2300, 5));
		list.add(new Employee("Emile Assis", 2000, 10));
		list.add(new Employee("Erik John", 4100, 10));

		Collections.sort(list);

		System.out.println("Employee sorted by salary :");
		for (Employee employee : list) {
			System.out.println(employee.getName() + ",Salary = " + employee.getSalary() + ",YearsInService = "
					+ employee.getYearsInService());
		}
	}

}
