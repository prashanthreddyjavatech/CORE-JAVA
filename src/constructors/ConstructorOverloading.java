package constructors;

public class ConstructorOverloading {
	 private int stuID;
	   private String stuName;
	   private int stuAge;
	   ConstructorOverloading()
	   {
	       //Default constructor
	       stuID = 100;
	       stuName = "John";
	       stuAge = 20;
	   }
	   ConstructorOverloading(int num1, String str, int num2)
	   {
	       //Parameterized constructor
	       stuID = num1;
	       stuName = str;
	       stuAge = num2;
	   }
	   //Getter and setter methods
	   public int getStuID() {
	       return stuID;
	   }
	   public void setStuID(int stuID) {
	       this.stuID = stuID;
	   }
	   public String getStuName() {
	       return stuName;
	   }
	   public void setStuName(String stuName) {
	       this.stuName = stuName;
	   }
	   public int getStuAge() {
	       return stuAge;
	   }
	   public void setStuAge(int stuAge) {
	       this.stuAge = stuAge;
	   }

	   public static void main(String args[])
	   {
	       //This object creation would call the default constructor
		   System.out.println("===Default constructor call===");
	       ConstructorOverloading myobj = new ConstructorOverloading();
	       System.out.println("Student Name : "+myobj.getStuName());
	       System.out.println("Student Age : "+myobj.getStuAge());
	       System.out.println("Student ID : "+myobj.getStuID());

	       /*This object creation would call the parameterized
	        * constructor ConstructorOverloading(int, String, int)*/
	       System.out.println("===Parameterized constructor call===");
	       ConstructorOverloading myobj2 = new ConstructorOverloading(101, "Prashanth", 30);
	       System.out.println("Student Name : "+myobj2.getStuName());
	       System.out.println("Student Age : "+myobj2.getStuAge());
	       System.out.println("Student ID : "+myobj2.getStuID()); 
	  }

}
