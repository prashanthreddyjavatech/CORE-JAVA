package switchcase;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		System.out.println("Please enter your  case");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		//switch expression
		switch(number) {
		case 1:
			System.out.println("Case1 executed");
			break;
		case 2:
			System.out.println("Case2 executed");
			break;
		case 3:
			System.out.println("Case3 executed");
			break;
		case 4:
			System.out.println("Case4 executed");
			break;
		case 5:
			System.out.println("Case5 executed");
			break;
		case 6:
			System.out.println("Case6 executed");
			break;
			// default case statement
			default:
				System.out.println("if any case wont match then default block will execute");
		}
		
		
		System.out.println("Nested switch example");
	    int i = 0;
	    switch (i) {
	    	case 0:
	    		int j = 1;
	    		switch (j) {
	    		case 0:
	    			System.out.println("i is 0, j is 0");
	    			break;
	    		case 1:
	    			System.out.println("i is 0, j is 1");
	    			break;
	    		default:
	    			System.out.println("nested default case!!");
	    		}
	    		break;
	    	default:
	    		System.out.println("No matching case found!!");
	    }
	}

}
