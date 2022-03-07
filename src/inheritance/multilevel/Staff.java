package inheritance.multilevel;

public class Staff extends Person {
	 private int staffId;

	 Staff(String name,int staffId) 
	    { 
	      super(name); 
	      this.staffId=staffId;
	    }
	public void display() 
    { 
      super.display(); 
      System.out.println("Staff Id is: " + staffId); 
    }

}
