package collections;

public class Student implements Comparable<Student> {
	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student s) {
		if(id>s.id) {
			return 1;
		}
		else if(id<s.id) {
			return -1;
		}else
		return 0;
	}

}
