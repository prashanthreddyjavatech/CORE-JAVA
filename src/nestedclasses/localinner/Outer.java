package nestedclasses.localinner;

// Local inner class
public class Outer {

	public void f1() {
		class Inner {
			public void f2() {
				System.out.println("Inside inner class  method call");
			}
		}
		Inner innerObj=new Inner();
		innerObj.f2();
	}

}
