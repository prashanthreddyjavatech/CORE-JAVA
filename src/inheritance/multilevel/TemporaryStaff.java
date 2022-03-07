package inheritance.multilevel;

public class TemporaryStaff extends Staff {
	private int hoursWorked;
	 private int days; 

	 TemporaryStaff(String name,int staffId,int days,int hoursWorked) 
	    {      
	       super(name,staffId); 
	       this.days  = days; 
	       this.hoursWorked = hoursWorked; 
	    }
	 public int Salary() 
	    { 
	        int salary = days * hoursWorked * 50;
	        
	      return salary;
	    } 
	 
	  public void display() 
	    { 
	      super.display(); 
	      System.out.println("No. of Days Worked: " + days); 
	      System.out.println("No. of Hours Worked: " + hoursWorked); 
	      System.out.println("Total Salary: " + Salary());
	    }
}
