package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	
	public static void main(String[] args) {
		Consumer<Integer> consumer= t -> System.out.println(t);
		consumer.accept(10);
	
		List<String> list=Arrays.asList("1","2","3","4","5");
		
		list.stream().forEach(t -> System.out.println(t));
		
	}

}
