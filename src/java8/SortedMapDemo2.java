package java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortedMapDemo2 {
	
	public static void main(String[] args) {
		
		Map<Emp,Integer> map=new HashMap<Emp,Integer>();
		map.put(new Emp(5,"prashanth2",3000),3);
		map.put(new Emp(2,"prashanth2",2000),1);
		map.put(new Emp(1,"prashanth2",5000),2);
		
		map.entrySet().stream().
		sorted(Map.Entry.comparingByKey(Comparator.comparing(Emp::getSal).reversed())).
		forEach(System.out::println);
		
	}

}

 class Emp{
	int id;String name;double sal;


	public Emp(int id, String name, double sal) {
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
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}
