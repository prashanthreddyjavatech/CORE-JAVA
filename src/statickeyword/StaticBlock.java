package statickeyword;

public class StaticBlock {
	   static String name;
	   
	   static{
		   name = "Prashanth";
	   }
	   
	   public static void main(String args[])
	   {
	      System.out.println("Hello "+name);
	   }

}
