package streamsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		List<Employee> EmployeesList = new ArrayList<Employee>();
		// Adding Employees
		EmployeesList.add(new Employee(1, "abc", 25000f));
		EmployeesList.add(new Employee(2, "pqr", 30000f));
		EmployeesList.add(new Employee(3, "xyz", 28000f));
		EmployeesList.add(new Employee(4, "mno", 28000f));
		EmployeesList.add(new Employee(5, "def", 90000f));

		List<Float> empSalaryListList2 = EmployeesList.stream()
				.filter(emp -> emp.salary > 30000)// filtering data
				.map(emp -> emp.salary) // fetching salary
				.collect(Collectors.toList()); // collecting as list
		System.out.println(empSalaryListList2);
		
		Stream<Employee> stream=EmployeesList.stream();
		stream.filter(emp -> emp.salary > 30000);
		stream.map(emp -> emp.salary);
		stream.collect(Collectors.toList());
		
		
		EmployeesList.stream().filter(emp -> emp.salary >30000).map(emp -> emp.salary).collect(Collectors.toList());
}

}
