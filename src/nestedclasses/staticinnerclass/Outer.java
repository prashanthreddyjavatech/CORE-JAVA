package nestedclasses.staticinnerclass;

//Accessing static inner class and static functionality
public class Outer {

	static void f1() {
		System.out.println("Outer class method call");
	}
	static class Inner{
		static void f2() {
			System.out.println("Inner class Method call");
		}
	}
}
