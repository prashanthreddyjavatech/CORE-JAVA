package statickeyword;

public class MultipleStaticBlocks {
	   static String name;
	   
	   //First Static block
	   static{
	      System.out.println("First Static block");
	      name = "Prashanth from Block1";
	  } 
	   
	  //Second static block
	  static{
	      System.out.println("Second Static Block");
	      name = "Prashanth from Block2";
	  }
	  public static void main(String args[])
	  {
	      System.out.println("Hello: "+name);
	   }

}
