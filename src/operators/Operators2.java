package operators;

public class Operators2 {
	public static void main(String[] args) {
		
		System.out.println("=============Arithmetic operators===========");
		int p=100;  
		int q=50;  
		System.out.println(p+q);
		System.out.println(p-q); 
		System.out.println(p*q);  
		System.out.println(p/q); 
		System.out.println(p%q);
		System.out.println(2*10+4-1); // 2*10=20 20+4=24 24-1=23
		
		System.out.println("=============Left shift operators===========");
		System.out.println(20<<2);//20*2^2=10*4=80  
		System.out.println(20<<3);//20*2^3=10*8=160  
		System.out.println(30<<2);//30*2^2=20*4=120  
		System.out.println(20<<4);//20*2^4=15*16=320 
		
		System.out.println("=============Right shift operators===========");
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(40>>2);//40/2^2=40/4=10  
		System.out.println(20>>3);//20/2^3=20/8=2
		
		System.out.println("============= Logical && and Bitwise & operators===========");
		int a=20;  
		int b=10;  
		int c=40;  
		System.out.println(a<b&&a<c);//false && true = false  it wont check second condition if first condition is false
		System.out.println(a<b&a<c);//false & true = false  it checks both conditions
		
		System.out.println("============= Logical && and Bitwise & operators===========");
	  
		System.out.println(a<b||a<c);//false || true = true  it wont check second condition if first condition is true
		System.out.println(a<b|a<c);//false | true = true  it checks both conditions
		
		System.out.println("============= Ternary Operator===========");
		int result=(a<b)?a:b;  //one liner replacement for if-then-else statement
		System.out.println(result);  
		
		
		
	}
	
}
