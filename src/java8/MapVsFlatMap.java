package java8;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
	public static void main(String[] args) {
		
		List<Customer> customers=DaoImplClass.getAll();
		
		List<String> emailList=customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		System.out.println(emailList);
		
		List<List<String>> phoneNumbersList=customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
		System.out.println(phoneNumbersList);
		
		List<String> phoneNumberList=customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
		System.out.println(phoneNumberList);
	}
	
	
	

}

class Customer{
	int id;String name;String email;
	List<String> phoneNumbers;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public Customer(int id, String name, String email, List<String> phoneNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
	}
	
	
}
