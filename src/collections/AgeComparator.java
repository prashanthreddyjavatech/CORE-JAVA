package collections;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee emp1, Employee emp2) {
		if(emp1.age>emp2.age) {
			return 1;
		}
		else if(emp1.age<emp2.age) {
			return -1;
		}
		else
			return 0;
	}

}
