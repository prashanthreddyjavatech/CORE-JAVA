package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
	
	public  static Customer getCustomerByName(String input) throws Exception {
		List<Customer> list=DaoImplClass.getAll();
		return list.stream().filter(customer -> customer.getName().equals(input))
				.findAny().orElseThrow(() -> new Exception("No name found"));
	}
	public static void main(String[] args) throws Exception {
		Customer customer=new Customer(1, "prashanth1", "prashanth@gmail.com", Arrays.asList("25425","35653"));
		
		//empty
		//of
		//ofNullable
		
		Optional<Object> emptyOptional=Optional.empty();
		System.out.println(emptyOptional);
		
		//Optional<String> emailOptional=Optional.of(customer.getEmail());
		//System.out.println(emailOptional);
		
		Optional<String> emailOptional2=Optional.ofNullable(customer.getEmail());
		if(emailOptional2.isPresent()) {
		System.out.println(emailOptional2.get());
		}
		
		System.out.println(emailOptional2.orElse("dumm@gmail.com"));
		
		System.out.println(getCustomerByName("reddy"));
	
	}

}
