package Activ8;

import java.util.Comparator;

public class YearsInServiceComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		if (e1.getYearsInService() < e2.getYearsInService())
			return 1;
		if (e1.getYearsInService() > e2.getYearsInService())
			return -1;

		else if (e1.getSalary() > e2.getSalary())
			return -1;
		else if (e1.getSalary() < e2.getSalary())
			return 1;
		else
			return 0;

	}

}
