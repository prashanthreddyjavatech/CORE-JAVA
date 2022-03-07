package exceptionhandling;

public class ThrowKeyWordEx {
	public static void main(String[] args) {
		int age = 16;
		
		if (age < 18)
			throw new ArithmeticException("not eligible");
		else
			System.out.println("eligible for do vote");
		
	}

}
