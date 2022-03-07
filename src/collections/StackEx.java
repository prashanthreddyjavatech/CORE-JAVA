package collections;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		stack.push("five");
		System.out.println(stack.isEmpty());
		System.out.println(stack);
		System.out.println(stack.peek());
	}

}
