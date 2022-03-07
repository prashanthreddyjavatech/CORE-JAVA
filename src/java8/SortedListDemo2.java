package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import collections.ComaprableTest;

public class SortedListDemo2 {
	
	public static void main(String[] args) {
		List<Employee1> list=new ArrayList<Employee1>();
		list.add(new Employee1(1, "prashanth1", 2000));
		list.add(new Employee1(2, "prashanth2", 1000));
		list.add(new Employee1(3, "prashanth3", 3000));
		list.add(null);
		

		//Collections.sort(list, (e1,e2) -> (int) (e1.getSal() - e2.getSal()));
		//System.out.println(list);
		
		//list.stream().sorted((e1,e2) -> (int) (e1.getSal() -e2.getSal())).forEach(obj -> System.out.println(obj));
		
		//list.stream().sorted(Comparator.comparing(emp -> emp.getSal())).forEach(emp -> System.out.println(emp));
		
		
		//method reference
		list.stream().filter(emp -> emp!=null).sorted(Comparator.comparing(Employee1::getName)).forEach(emp -> System.out.println(emp));
	}

}

class Employee1{
	int id; String name; double sal;

	public Employee1(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
}
