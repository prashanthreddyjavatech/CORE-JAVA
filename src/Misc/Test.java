package Misc;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	float salary;

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}

public class Test {
	public static void main(String[] args) {
		List<Employee> EmployeesList = new ArrayList<Employee>();
		// Adding Employees
		EmployeesList.add(new Employee(1, "HP Laptop", 25000f));
		EmployeesList.add(new Employee(2, "Dell Laptop", 30000f));
		EmployeesList.add(new Employee(3, "Lenevo Laptop", 28000f));
		EmployeesList.add(new Employee(4, "Sony Laptop", 28000f));
		EmployeesList.add(new Employee(5, "Apple Laptop", 90000f));

		List<Float> empSalaryListList2 = EmployeesList.stream()
				.filter(emp -> emp.salary > 30000)// filtering data
				.map(emp -> emp.salary) // fetching price
				.collect(Collectors.toList()); // collecting as list
		System.out.println(empSalaryListList2);
	}
}