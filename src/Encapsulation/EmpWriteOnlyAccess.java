package Encapsulation;

public class EmpWriteOnlyAccess {
	private String company;

	
	public void setCompany(String company) {
		this.company = company;
	}
	
	// In main class if you will do like below 
	// EmpWriteOnlyAccess empObj=new EmpWriteOnlyAccess();
	// empObj.getCompany(); // compile time error because  there is no such method  
	
	

}
