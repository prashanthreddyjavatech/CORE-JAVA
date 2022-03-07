package objectclass;

public class Student {

	int id;
	String name;
	int marks;
	
	
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


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public void initialize(int id,String name,int marks) {
			int rollNo=id;
			String stName=name;
			int stMarks=marks;
			System.out.println("Student id : "+rollNo);
			System.out.println("Student name : "+stName);
			System.out.println("Student marks : "+stMarks);
	}

}
