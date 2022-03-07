package constructors;

public class Rectangle {
	
	int length;
    int breadth;
    
    //constructor to initialize length and breadth of  Rectangle
    Rectangle(int l, int b)
    { 
       length = l;
       breadth= b;
    }
    //copy constructor
    Rectangle(Rectangle obj)
    {
      System.out.println("Copy Constructor call executed");
      length = obj.length;
      breadth= obj.breadth;
    }
   //method to calculate area of Rectangle
   int area()
   {
      return (length * breadth);
   }

}
