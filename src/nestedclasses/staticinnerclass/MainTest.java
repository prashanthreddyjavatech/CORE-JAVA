package nestedclasses.staticinnerclass;

public class MainTest {
	public static void main(String[] args) {
		Outer.f1();
		// Outer.f2(); // Not allowed
		Outer.Inner.f2();
	}

}
