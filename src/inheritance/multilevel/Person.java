package inheritance.multilevel;

public class Person {
	private String name;

	Person(String name) 
    {   
          this.name=name;
    }
	public void display() 
    { 
      System.out.println("Name of the Person: " + name); 
    } 

}
