package methods;

public class MethodExample1 {
	public static void main(String[] args) {
		int a=10;
		int b=5;
		int sumResult=sum(a,b);
		int subResult=sub(a,b);
		int mulResult=mul(a,b);
		int divisonResult=div(a,b);
		System.out.println("Addition of two numbers: "+sumResult);
		System.out.println("Substarction of two numbers: "+subResult);
		System.out.println("Multiplication of two numbers: "+mulResult);
		System.out.println("Division of two numbers: "+divisonResult);
	
	}
	public static int sum(int a,int b) {
		int c=a+b;
		return c;
	}
	public static int sub(int a,int b) {
		int c=a-b;
		return c;
	}
	public static int mul(int a,int b) {
		int c=a*b;
		return c;
	}
	public static int div(int a,int b) {
		int c=a/b;
		return c;
	}

}
