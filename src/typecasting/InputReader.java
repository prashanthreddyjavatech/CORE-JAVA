package typecasting;

import java.util.Scanner;
public class InputReader {
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter integer number");
	int i=sc.nextInt();
	System.out.println("The integer value is:"+i);
	
	System.out.println("Enter flaot number");
	float f=sc.nextFloat();
	System.out.println("The float value is:"+f);
	
	//same try for short,byte,boolean,double etc..,
	}
}
