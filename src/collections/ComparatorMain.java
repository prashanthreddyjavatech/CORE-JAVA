package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorMain {
	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101, "Prashanth", 30));
		list.add(new Employee(102,"Manish",25));
		list.add(new Employee(103, "John", 40));
		
		Collections.sort(list,new AgeComparator());
		
		for(Employee e : list) {
			System.out.println(e);
		}
		
		System.out.println("\n sorting by name \n");
		Collections.sort(list,new NameComparator());
		for(Employee e : list) {
			System.out.println(e);
		}
		
	}
}
