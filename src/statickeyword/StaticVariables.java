package statickeyword;

public class StaticVariables {
	
	  static int num;
	  static String val;
	  
	  //This is a Static Method
	  static void display(){
	      System.out.println("Number is: "+num);
	      System.out.println("String  is: "+val);
	  }
	  public static void main(String args[]) 
	  {
	      display();
	  }

}
