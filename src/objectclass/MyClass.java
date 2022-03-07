package objectclass;

public class MyClass {
	public static void main(String[] args) {
		
		 //Creating objects 
		Student s1=new Student();
		//printing data after objects Initialization
		System.out.println('\n'+"=====display data before objects Initialization===== "+'\n');
		System.out.println("Student id : "+s1.id);
		System.out.println("Student name : "+s1.name);
		System.out.println("Student marks : "+s1.marks);
		
		//Initializing objects  
		s1.id=1;
		s1.name="Prashanth";
		s1.marks=100;
		//printing data after objects Initialization
		System.out.println('\n'+"=====display data after objects Initialization===== "+'\n');
		System.out.println("Student id : "+s1.id);
		System.out.println("Student name : "+s1.name);
		System.out.println("Student marks : "+s1.marks);
		
		
		System.out.println('\n'+"=====Initialization through method===== "+'\n');
		s1.initialize(10, "John", 75);
		
		System.out.println('\n'+"=====Initialization through setters and getters===== "+'\n');
		s1.setId(20);
		s1.setName("Smith");
		s1.setMarks(60);
		System.out.println("Student id : "+s1.id);
		System.out.println("Student name : "+s1.name);
		System.out.println("Student marks : "+s1.marks);
		
	}
	


}
