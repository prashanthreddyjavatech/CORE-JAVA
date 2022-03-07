package inheritance.simple;

public class Employee extends Company{
  String empName="Prashanth";
	public static void main(String[] args) {
		
		Employee e=new Employee();
		System.out.println("Company Name: "+e.cName);
		System.out.println("Employee Name: "+e.empName);
	}

}