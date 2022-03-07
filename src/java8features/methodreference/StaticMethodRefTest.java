package java8features.methodreference;

import java.util.function.BiFunction;

public class StaticMethodRefTest {
public static void main(String[] args) {
	BiFunction<Integer, Integer, Integer> result=Addition::sum;
	int value=result.apply(10, 20);
	System.out.println(value);
}
}
