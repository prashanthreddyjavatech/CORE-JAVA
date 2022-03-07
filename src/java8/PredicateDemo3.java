package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo3 {
	
	public static void main(String[] args) {
		
		Predicate<Integer> p = t -> t%2==0;
		System.out.println(p.test(10));
		
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		
		list.stream().filter(t -> t%2==0).forEach(t -> System.out.println(t));
	}

}
