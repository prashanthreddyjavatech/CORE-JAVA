package java8;

import java.util.function.Supplier;

public class SupplierDemo1 implements Supplier<String>{

	@Override
	public String get() {
		return "Hello Prashanth";
	}
	
	public static void main(String[] args) {
		Supplier<String> supplier=new SupplierDemo1();
		System.out.println(supplier.get());
	}

}
