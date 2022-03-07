package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComaprableTest {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(101, "Prashanth", 30));
		list.add(new Student(99, "John", 40));
		list.add(new Student(77, "Mark", 50));
		Collections.sort(list);
		for(Student s:list) {
			System.out.println(s.id+":"+s.name+" "+s.age);
		}
	}

}
