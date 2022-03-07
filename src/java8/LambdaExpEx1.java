package java8;


interface Maths{
	//void show();
	
	//void add(int a,int b);
	
	//do practice for substract
	
	String isEvenOdd(int a);
}
public class LambdaExpEx1 {
	public static void main(String[] args) {
		/*
		 * Maths m= () -> System.out.println("Maths problems"); m.show();
		 */
		
		/*
		 * Maths m=(a,b) -> {System.out.println(a+b);}; m.add(2,3);
		 */
		
		Maths m = (a) -> {
			if(a%2==0) {
				return "even";
			}else {
				return "odd";
			}
		};
		
		System.out.println(m.isEvenOdd(10));
	
	}	
}
