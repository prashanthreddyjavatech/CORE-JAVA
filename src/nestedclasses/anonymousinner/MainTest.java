package nestedclasses.anonymousinner;

public class MainTest {
	// Anonymous inner class 
	public static void main(String[] args) {
		Outer outerObj=new Outer() {
			public void f1() {
				System.out.println("Anonymous class method call");
			}  
		};
		outerObj.f1();
		
	}

}
