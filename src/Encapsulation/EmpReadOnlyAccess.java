package Encapsulation;

public class EmpReadOnlyAccess {
	private String company="FaceBook";

	public String getCompany() {
		return company;
	}

	// In main class if you will do like below 
	// EmpReadOnlyAccess empObj=new EmpReadOnlyAccess();
	// empObj.setCompany("Google"); // compile time error
}
