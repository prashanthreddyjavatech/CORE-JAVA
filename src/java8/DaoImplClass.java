package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DaoImplClass {
		static List<Customer> getAll(){
			return Stream.of(
				new Customer(1, "prashanth1", "prashanth1@java.com", Arrays.asList("25425","35653")),
				new Customer(2, "prashanth2", "prashanth2@java.com", Arrays.asList("4336","7677")),
				new Customer(3, "prashanth3", "prashanth3@java.com", Arrays.asList("256575","54367"))
				,new Customer(3, "prashanth3", null, Arrays.asList("256575","54367"))
				).collect(Collectors.toList());
			}
		}


