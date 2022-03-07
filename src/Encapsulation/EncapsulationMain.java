package Encapsulation;

public class EncapsulationMain {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(101);
		emp.setName("Prashanth");
		System.out.println("Emp Id: "+emp.getId());
		System.out.println("Emp Name: "+emp.getName());
	}

}
