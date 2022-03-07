package nestedclasses.nonstaticinner;

// Accessing non-static inner class and its non-static functionality
public class Outer {
	void f1() {
		System.out.println("Outer class method call");
	}
	class Inner{
		void f2() {
			System.out.println("Inner class method call");
		}
	}

}
