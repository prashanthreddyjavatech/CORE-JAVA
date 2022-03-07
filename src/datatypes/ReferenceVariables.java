package datatypes;

public class ReferenceVariables {
	
	int x = 50;// instance variable (outside method and inside class)
	
	static int y = 100;// static variable ( prefix with static keyword, outside method and inside class)

	public void method() {
		int z = 90; // local variable (inside method)
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		ReferenceVariables r = new ReferenceVariables();
		r.method();
		// System.out.println(x); // Cannot make a static reference to the non-static fields 
		System.out.println(y);
		// System.out.println(z); //local variable is not accessible to outside of method
		

	}

}
