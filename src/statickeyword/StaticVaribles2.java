package statickeyword;

public class StaticVaribles2 {
	
	  //Static integer variable
	   static int id=10
			   ; 
	   //non-static string variable
	   String name; 

	   public static void main(String args[])
	   {
		StaticVaribles2 ob1 = new StaticVaribles2();
		StaticVaribles2 ob2 = new StaticVaribles2();
		
		/* static variables can be accessed directly without
		 * any instances. 
		 * Just to demonstrate that static variables
		 * are shared, 
		 * I am accessing them using objects so that 
		 * we can check that the changes made to static variables
		 * by one object,
		 *  reflects when we access them using other
		 * objects
		 */
	        //Assigning the value to static variable using object ob1
		ob1.id=88;
		ob1.name="I'm Object1";
	        /* This will overwrite the value of var1 because var1 has a single 
	         * copy shared among both the objects.
	         */
	     ob2.id=99;
		ob2.name="I'm Object2";
		System.out.println("ob1 integer:"+ob1.id);
		System.out.println("ob1 String:"+ob1.name);
		System.out.println("ob2 integer:"+ob2.id);
		System.out.println("ob2 String:"+ob2.name);
	   }

}
