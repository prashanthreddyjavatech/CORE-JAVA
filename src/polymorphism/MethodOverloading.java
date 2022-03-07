package polymorphism;

public class MethodOverloading {
	
	//with same method name and different number of arguments
	
	//with 2 arguments
	public static int add(int a, int b) {
		return a + b;
	}

	//with 3 arguments
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	
	
	/* Compile time error if we change the return type
	 * public static int sub(int a, int b) {
	 * 		 return a + b;
	 *   }
	 * 
	 * public static long sub(int a, int b) {
	 *  	return a + b; 
	 *  }
	 */
	
	// data type change
	public static int sum(int a, int b) {
		return a+b;
	}

	public static int  sum(long a, long b) {
		return (int) (a+b);
	}
 
	//Ambiguous for the data type
	public long mul(int a, long b) {
		return (a*b);
	}

	public long  mul(long a, int b) {
		return (a*b);
	}
	 
	public static void main(String[] args) {
		int n1=add(10,20);
		int n2=add(10,20,30);
		System.out.println("Sum of two arguments: "+n1);
		System.out.println("Sum of three arguments: "+n2);
		int m1=sum(10,20);
		System.out.println("Sum of two numbers: "+m1);
	 // int p=mul(10,10);  //The method mul(int, long) is ambiguous for the type MethodOverloading
	}

}
