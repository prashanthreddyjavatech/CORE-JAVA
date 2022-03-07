package operators;

public class Operators {
	public static void main(String[] args) {
		
		System.out.println("----------------Unary Operators------------");
		
		System.out.println("=============Increament and Decreament operators");
		int x=10;
		System.out.println(x++);//10 (11)  // post increment
		System.out.println(++x);//12       // pre increment
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
		
		System.out.println("=============Increament and Decreament operators with additional=======");
		int a=5;
		int b=15;
		System.out.println(a++ + ++a);//5+7=12  
		System.out.println(b++ + b++);//15+16=31
		
		System.out.println("=============tild operator============");
		int m=20;
		int n=-20;
		System.out.println(~m);
		System.out.println(~n);
		
		System.out.println("=============not conditional operator===========");
		boolean b1=true;
		boolean b2=false;
		System.out.println(!b1);
		System.out.println(!b2);
		

	}

}
