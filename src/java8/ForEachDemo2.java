package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ForEachDemo2 {
	
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1, "prashanth1", 1000));
		list.add(new Employee(2, "prashanth2", 2000));
		list.add(new Employee(3, "prashanth3", 3000));
		
		List<Employee> filteredList=list.stream().filter(obj -> obj.getName().equals("prashanth1")).collect(Collectors.toList());
		System.out.println(filteredList);
		
		Predicate<Integer> p=t -> t%2==0;
		System.out.println(p.test(10)?"even":"odd");
	}

}

class Employee{
	int id; String name; double sal;

	public Employee(int id, String name, double sal) {
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
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
}
