package nestedclasses.nonstaticinner;

public class MainTest {
	public static void main(String[] args) {
		Outer outerObj=new Outer();
		outerObj.f1();
		Outer.Inner innerObj=outerObj.new Inner();
		innerObj.f2();
	}

}
