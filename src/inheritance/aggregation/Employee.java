package inheritance.aggregation;

public class Employee {
	int id;  
	String name;  
	Address address;  
	  
	public Employee(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	public void display(){  
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
	  
	public static void main(String[] args) {  
	Address address1=new Address("Hyd","TS","india");  
	Address address2=new Address("Pune","MH","india");  
	  
	// HAS-A Relationship
	Employee emp1=new Employee(101,"prashanth",address1);  
	Employee emp2=new Employee(102,"John",address2);  
	      
	emp1.display();  
	emp2.display();  
	}
}
