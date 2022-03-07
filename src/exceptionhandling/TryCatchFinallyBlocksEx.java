package exceptionhandling;

public class TryCatchFinallyBlocksEx {
	public static void main(String args[]) {
		try {
			int number = 10 / 0;
			System.out.println(number);
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		} finally {
			System.out.println("finally block will execute everytime");
		}
		System.out.println("next lines of code execution start");
	}

}
