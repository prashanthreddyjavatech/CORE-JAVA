package exceptionhandling;

import java.io.IOException;

/*In this example the method myMethod() is throwing two checked exceptions
 *  so we have declared these exceptions in the method signature using throws Keyword. 
 *  If we do not declare these exceptions then the program will throw a compilation error.*/

public class ThrowsKeyWordExample {

	public static void main(String args[]) {
		try {
			Example1 obj = new Example1();
			obj.myMethod(1);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}

	class Example1 {
		void myMethod(int num) throws IOException, ClassNotFoundException  {
			if (num == 1)
				throw new IOException("IOException Occurred");
			else
				throw new ClassNotFoundException("ClassNotFoundException");
		}
	}
