package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo2 {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Hello Prashanth";
		System.out.println(supplier.get());

		// List<String> list=Arrays.asList("1","2","3","4","5");
		List<String> list1 = Arrays.asList();

		System.out.println(list1.stream().findAny().orElseGet(supplier));
	}

}
